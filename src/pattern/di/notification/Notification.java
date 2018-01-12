package pattern.di.notification;

public class Notification {
    private Messenger messenger;

    public Notification(Messenger messenger){
        this.messenger = messenger;
    }

    public void sendNewPassword(User user){
        this.messenger.sendMessage("Hello " + user.getName() + ". New password is qwerty.", user);
    }

    public void sendPhoneNumber(User user){
        this.messenger.sendMessage("Hello " + user.getName() + ". your phone number is " + user.getPhone(), user);
    }
}