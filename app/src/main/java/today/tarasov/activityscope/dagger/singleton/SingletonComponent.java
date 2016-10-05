package today.tarasov.activityscope.dagger.singleton;

import javax.inject.Singleton;

import dagger.Component;
import today.tarasov.activityscope.dagger.activity.ComponentActivityA;
import today.tarasov.activityscope.dagger.activity.ComponentActivityB;
import today.tarasov.activityscope.dagger.activity.ModuleA;
import today.tarasov.activityscope.dagger.activity.ModuleB;
import today.tarasov.activityscope.dagger.activity.SharedModule;

/**
 * @author Dmitriy Tarasov
 */
@Singleton
@Component(modules = SingletonModule.class)
public interface SingletonComponent {

    ComponentActivityA newComponent(ModuleA a, SharedModule shared);

    ComponentActivityB newComponent(ModuleB b, SharedModule shared);
}
