package pattern.creational.singleton.lazyInitialization;

public class SingletonSynchronizedAccessor {
    private static SingletonSynchronizedAccessor instance;

    public static synchronized SingletonSynchronizedAccessor getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedAccessor();
        }
        return instance;
    }
}
