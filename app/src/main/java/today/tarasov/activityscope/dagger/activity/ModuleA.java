package today.tarasov.activityscope.dagger.activity;

import dagger.Module;
import dagger.Provides;
import today.tarasov.activityscope.bean.BeanA;

/**
 * @author Dmitriy Tarasov
 */
@Module
public class ModuleA {

    @ActivityScope
    @Provides
    BeanA provideBeanA() {
        return new BeanA();
    }
}
