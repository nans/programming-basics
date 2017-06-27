package pattern.creational.singleton.config;

public class ConfigApplication {
    public ConfigApplication() {
        UserConfig config = UserConfig.getInstance();
        config.getData();
    }
}
