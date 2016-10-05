package today.tarasov.activityscope.dagger.activity;

import dagger.Subcomponent;
import today.tarasov.activityscope.ActivityB;
import today.tarasov.activityscope.SharedFragment;

/**
 * @author Dmitriy Tarasov
 */
@ActivityScope
@Subcomponent(modules = {ModuleB.class, SharedModule.class})
public interface ComponentActivityB {

    void inject(ActivityB activity);

    void inject(SharedFragment fragment);
}
