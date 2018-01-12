package pattern.di.notification;

public class EmailMessenger implements Messenger {
    private Logger logger;

    @Override
    public boolean sendMessage(String text, User user) {
        if (this.logger != null) {
            this.logger.log("Send email message: " + text + " \nTo " + user.getEmail());
        }
        //send data
        return true;
    }

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}