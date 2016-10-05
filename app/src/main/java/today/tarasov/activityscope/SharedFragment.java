package today.tarasov.activityscope;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import today.tarasov.activityscope.bean.SharedBean;
import today.tarasov.activityscope.bean.SingletonBean;

/**
 * @author Dmitriy Tarasov
 */

public class SharedFragment extends Fragment {

    @Inject
    SharedBean shared;
    @Inject
    SingletonBean singleton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView view = (TextView) inflater.inflate(R.layout.fragment_shared, container, false);
        view.setText(String.format("%s\n%s", shared, singleton));
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InjectorProvider) {
            ((InjectorProvider) context).inject(this);
        } else {
            throw new IllegalStateException("You should provide InjectorProvider");
        }
    }

    public interface InjectorProvider {
        void inject(SharedFragment fragment);
    }
}
