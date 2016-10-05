package today.tarasov.activityscope.dagger.singleton;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import today.tarasov.activityscope.bean.SingletonBean;

/**
 * @author Dmitriy Tarasov
 */
@Module
public class SingletonModule {

    @Singleton
    @Provides
    SingletonBean provideSingletonBean() {
        return new SingletonBean();
    }
}
