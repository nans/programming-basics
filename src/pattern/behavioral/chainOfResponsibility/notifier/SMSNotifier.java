package pattern.behavioral.chainOfResponsibility.notifier;

public class SMSNotifier extends Notifier {
    public SMSNotifier(int rarity) {
        super(rarity);
    }

    @Override
    public void notify(String message) {
        System.out.println("Send message by sms: " + message);
    }
}
