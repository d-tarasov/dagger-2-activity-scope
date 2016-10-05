package today.tarasov.activityscope.dagger.activity;

import dagger.Module;
import dagger.Provides;
import today.tarasov.activityscope.bean.BeanB;

/**
 * @author Dmitriy Tarasov
 */
@Module
public class ModuleB {

    @ActivityScope
    @Provides
    BeanB provideBeanB() {
        return new BeanB();
    }
}
