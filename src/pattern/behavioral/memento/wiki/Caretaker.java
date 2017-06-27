/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.memento.wiki;

public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
