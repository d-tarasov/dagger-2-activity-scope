package today.tarasov.activityscope.dagger;

import today.tarasov.activityscope.dagger.singleton.DaggerSingletonComponent;
import today.tarasov.activityscope.dagger.singleton.SingletonComponent;
import today.tarasov.activityscope.dagger.singleton.SingletonModule;

/**
 * @author Dmitriy Tarasov
 */

public final class Injector {

    private static final Injector INSTANCE = new Injector();

    private SingletonComponent singletonComponent;

    /**
     * Disable instantiating
     */
    private Injector() {
        singletonComponent = DaggerSingletonComponent.builder()
                .singletonModule(new SingletonModule())
                .build();
    }

    public static SingletonComponent getSingletonComponent() {
        return INSTANCE.singletonComponent;
    }
}
