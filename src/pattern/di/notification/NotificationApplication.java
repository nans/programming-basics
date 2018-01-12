package pattern.di.notification;

public class NotificationApplication {

    public NotificationApplication() {
        User userAdmin = new User("Alex", "simpleEmail@email.domain", "+34435345345345");
        User userClient = new User("Bob", "simpleEmail2@email.domain", "+34435345345346");

        Logger logger = new Logger();

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.setLogger(logger); //Setter-based Dependency Injection

        SmsMessenger smsMessenger = new SmsMessenger();
        smsMessenger.setLogger(logger); //Setter-based Dependency Injection

        Notification notification = new Notification(emailMessenger); //Constructor-based dependency injection
        notification.sendNewPassword(userClient);
    }
}