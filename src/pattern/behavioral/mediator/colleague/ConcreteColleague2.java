/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.mediator.colleague;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }
}
