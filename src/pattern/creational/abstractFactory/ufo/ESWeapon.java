/*
 * Author: Derek Banas
 * Original: http://www.newthinktank.com/2012/09/abstract-factory-design-pattern/
 */
package pattern.creational.abstractFactory.ufo;

// Any part that implements the interface ESWeapon
// can replace that part in any ship

public interface ESWeapon{

    // User is forced to implement this method
    // It outputs the string returned when the
    // object is printed

    public String toString();

}
