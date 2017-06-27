/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.mediator.colleague;

public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);
}
