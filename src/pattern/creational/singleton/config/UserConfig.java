package pattern.creational.singleton.config;

public class UserConfig {
    private static UserConfig instance = new UserConfig();

    private UserConfig() {
    }

    public static UserConfig getInstance() {
        return instance;
    }

    public void getData(){
        System.out.println("User configs:\n ...");
    }
}
