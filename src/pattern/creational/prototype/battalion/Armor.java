package pattern.creational.prototype.battalion;

public interface Armor extends Cloneable {
    public Armor makeCopy() throws CloneNotSupportedException;
}
