/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
 */
package pattern.structural.decorator.pizza;

public class PlainPizza implements Pizza {
    public String getDescription() {
        return "Thin dough";
    }

    public double getCost() {
        System.out.println("Cost of Dough: " + 4.00);
        return 4.00;
    }
}
