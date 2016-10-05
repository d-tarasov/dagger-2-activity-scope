package today.tarasov.activityscope.bean;

import java.util.Random;

/**
 * @author Dmitriy Tarasov
 */

public class IdGenerator {

    private static int counter = new Random().nextInt(1000);

    public static synchronized String getId() {
        return String.valueOf(counter++);
    }
}
