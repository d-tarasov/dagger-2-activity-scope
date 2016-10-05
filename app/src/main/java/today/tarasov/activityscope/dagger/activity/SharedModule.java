package today.tarasov.activityscope.dagger.activity;

import dagger.Module;
import dagger.Provides;
import today.tarasov.activityscope.bean.SharedBean;

/**
 * @author Dmitriy Tarasov
 */
@Module
public class SharedModule {

    @ActivityScope
    @Provides
    SharedBean provideSharedBean() {
        return new SharedBean();
    }
}
