/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.mediator.colleague;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
