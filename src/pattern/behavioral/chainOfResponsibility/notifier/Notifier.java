package pattern.behavioral.chainOfResponsibility.notifier;

public abstract class Notifier {
    private int rarity;
    private Notifier nextNotifier;

    public Notifier(int rarity) {
        this.rarity = rarity;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyCollector(String message, int priority) {
        if (priority >= rarity) {
            notify(message);
        }
        if (hasNextNotifier()) {
            nextNotifier.notifyCollector(message, priority);
        }
    }

    protected abstract void notify(String message);

    private Boolean hasNextNotifier() {
        return nextNotifier != null;
    }
}
