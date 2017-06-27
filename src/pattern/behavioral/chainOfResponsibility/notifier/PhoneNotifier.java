package pattern.behavioral.chainOfResponsibility.notifier;

public class PhoneNotifier extends Notifier {
    public PhoneNotifier(int rarity) {
        super(rarity);
    }

    @Override
    public void notify(String message) {
        System.out.println("Add a task for seller with max priority: " + message);
    }
}
