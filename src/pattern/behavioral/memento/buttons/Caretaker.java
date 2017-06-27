/**
 * Author: Derek Banas
 * Original: http://www.newthinktank.com/2012/10/memento-design-pattern-tutorial/
 */
package pattern.behavioral.memento.buttons;

// Memento Design Pattern Tutorial

import java.util.ArrayList;

class Caretaker {

    // Where all mementos are saved

    ArrayList<Memento> savedArticles = new ArrayList<Memento>();

    // Adds memento to the ArrayList

    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    // Gets the memento requested from the ArrayList

    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }
}
