package today.tarasov.activityscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import today.tarasov.activityscope.bean.BeanB;
import today.tarasov.activityscope.bean.SharedBean;
import today.tarasov.activityscope.bean.SingletonBean;
import today.tarasov.activityscope.dagger.Injector;
import today.tarasov.activityscope.dagger.activity.ComponentActivityB;
import today.tarasov.activityscope.dagger.activity.ModuleB;
import today.tarasov.activityscope.dagger.activity.SharedModule;

public class ActivityB extends AppCompatActivity implements SharedFragment.InjectorProvider {

    @Inject
    SharedBean shared;
    @Inject
    BeanB b;
    @Inject
    SingletonBean singleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        TextView tv = (TextView) findViewById(R.id.text);
        tv.setText(String.format("%s\n%s\n%s", b, shared, singleton));
    }

    @Override
    public void inject(SharedFragment fragment) {
        ComponentActivityB component =
                Injector.getSingletonComponent()
                        .newComponent(new ModuleB(), new SharedModule());
        component.inject(this);
        component.inject(fragment);
    }
}
