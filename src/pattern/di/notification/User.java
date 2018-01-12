package pattern.di.notification;

public class User {
    private String name;
    private String email;
    private String phone;

    public User(String userName, String email, String phone) {
        this.name = userName;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}