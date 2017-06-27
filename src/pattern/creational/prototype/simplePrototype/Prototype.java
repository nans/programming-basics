/*
* Original: https://en.wikipedia.org/wiki/Prototype_pattern
 */
package pattern.creational.prototype.simplePrototype;

public class Prototype implements Cloneable {
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
