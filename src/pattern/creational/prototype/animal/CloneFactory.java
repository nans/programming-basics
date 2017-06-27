/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/prototype-design-pattern-tutorial/
 */
package pattern.creational.prototype.animal;

public class CloneFactory {
    public Animal getClone(Animal animalSample) {

        // Because of Polymorphism the Sheeps makeCopy()
        // is called here instead of Animals

        return animalSample.makeCopy();

    }
}
