/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.memento.wiki;

public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
