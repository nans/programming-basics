package pattern.creational.singleton.lazyInitialization;

public class SingletonOnDemandHolder {
    public static class SingletonHolder {
        public static final SingletonOnDemandHolder HOLDER_INSTANCE = new SingletonOnDemandHolder();
    }

    public static SingletonOnDemandHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
