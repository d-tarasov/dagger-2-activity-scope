package today.tarasov.activityscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import today.tarasov.activityscope.bean.BeanA;
import today.tarasov.activityscope.bean.SharedBean;
import today.tarasov.activityscope.bean.SingletonBean;
import today.tarasov.activityscope.dagger.Injector;
import today.tarasov.activityscope.dagger.activity.ComponentActivityA;
import today.tarasov.activityscope.dagger.activity.ModuleA;
import today.tarasov.activityscope.dagger.activity.SharedModule;

public class ActivityA extends AppCompatActivity implements SharedFragment.InjectorProvider {

    @Inject
    SharedBean shared;
    @Inject
    BeanA a;
    @Inject
    SingletonBean singleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        TextView tv = (TextView) findViewById(R.id.text);
        tv.setText(String.format("%s\n%s\n%s", a, shared, singleton));
    }

    @Override
    public void inject(SharedFragment fragment) {
        ComponentActivityA component =
                Injector.getSingletonComponent()
                        .newComponent(new ModuleA(), new SharedModule());
        component.inject(this);
        component.inject(fragment);
    }
}
