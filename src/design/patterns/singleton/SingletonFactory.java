package design.patterns.singleton;

/**
 * Created by dawid on 09/07/16.
 */
public class SingletonFactory {
    private static Singleton singleton;

    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
