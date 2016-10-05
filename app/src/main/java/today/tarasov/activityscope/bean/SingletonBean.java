package today.tarasov.activityscope.bean;

import javax.inject.Singleton;

/**
 * @author Dmitriy Tarasov
 */
@Singleton
public class SingletonBean {

    private String id = IdGenerator.getId();

    @Override
    public String toString() {
        return String.format("{Singleton : %s}", id);
    }
}
