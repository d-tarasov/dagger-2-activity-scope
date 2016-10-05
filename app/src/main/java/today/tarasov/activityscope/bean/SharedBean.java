package today.tarasov.activityscope.bean;

import today.tarasov.activityscope.dagger.activity.ActivityScope;

/**
 * @author Dmitriy Tarasov
 */
@ActivityScope
public class SharedBean {

    private String id = IdGenerator.getId();

    @Override
    public String toString() {
        return String.format("{Shared : %s}", id);
    }
}
