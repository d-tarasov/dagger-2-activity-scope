package today.tarasov.activityscope.bean;

import today.tarasov.activityscope.dagger.activity.ActivityScope;

/**
 * @author Dmitriy Tarasov
 */
@ActivityScope
public class BeanA {

    private String id = IdGenerator.getId();

    @Override
    public String toString() {
        return String.format("{A : %s}", id);
    }
}
