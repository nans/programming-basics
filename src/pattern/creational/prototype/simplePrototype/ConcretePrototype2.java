/*
* Original: https://en.wikipedia.org/wiki/Prototype_pattern
 */
package pattern.creational.prototype.simplePrototype;

public class ConcretePrototype2 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
