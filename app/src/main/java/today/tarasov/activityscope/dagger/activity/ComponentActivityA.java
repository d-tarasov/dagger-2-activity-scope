package today.tarasov.activityscope.dagger.activity;

import dagger.Subcomponent;
import today.tarasov.activityscope.ActivityA;
import today.tarasov.activityscope.SharedFragment;

/**
 * @author Dmitriy Tarasov
 */
@ActivityScope
@Subcomponent(modules = {ModuleA.class, SharedModule.class})
public interface ComponentActivityA {

    void inject(ActivityA activity);

    void inject(SharedFragment fragment);
}
