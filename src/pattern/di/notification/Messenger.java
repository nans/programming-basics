package pattern.di.notification;

public interface Messenger {
    public boolean sendMessage(String text, User user);
    public void setLogger(Logger logger);
}