package pattern.di.notification;

public class SmsMessenger implements Messenger {
    private Logger logger;

    @Override
    public boolean sendMessage(String text, User user) {
        if(text.length() > 200){
            return false;
        }

        if (this.logger != null) {
            this.logger.log("Send sms message: " + text + " \nTo " + user.getPhone());
        }
        //send data
        return true;
    }

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}