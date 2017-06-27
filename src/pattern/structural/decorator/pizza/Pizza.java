/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
 */
package pattern.structural.decorator.pizza;

public interface Pizza {
    public String getDescription();
    public double getCost();
}


/*
public abstract class Pizza{
    public abstract void setDescription(String newDescription);
    public abstract String getDescription();
    public abstract void setCost(double newCost);
    public abstract double getCost();
    // I could use getter and setter methods for every
    // potential Pizza topping
}
*/






