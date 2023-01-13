package patterns.singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance = new SynchronizedSingleton();
    private SynchronizedSingleton(){
    }

    public static SynchronizedSingleton getInstance(){
        return instance;
    }
}
