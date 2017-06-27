package pattern.behavioral.chainOfResponsibility.notifier;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int rarity) {
        super(rarity);
    }

    @Override
    public void notify(String message) {
        System.out.println("Send message to email: " + message);
    }
}
