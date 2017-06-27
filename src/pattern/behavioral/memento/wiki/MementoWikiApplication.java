/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.memento.wiki;

public class MementoWikiApplication {
    public MementoWikiApplication() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("off");
        System.out.printf("State is %s\n", originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.printf("State is %s\n", originator.getState());
    }
}
