/*
* Original: https://en.wikipedia.org/wiki/Prototype_pattern
 */
package pattern.creational.prototype.simplePrototype;

public interface Cloneable {
    public Prototype clone() throws CloneNotSupportedException;
}
