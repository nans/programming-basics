package pattern.behavioral.chainOfResponsibility.notifier;

public class CatalogNotifier extends Notifier {
    public CatalogNotifier(int rarity) {
        super(rarity);
    }

    @Override
    public void notify(String message) {
        System.out.println("Send message to Directory Account: " + message);
    }
}
