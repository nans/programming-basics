/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
 */
package pattern.structural.decorator.pizza;

public class PizzaMaker {
    //use for watch result
    public PizzaMaker() {
        System.out.println("PizzaMaker");
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        Pizza basicPizza = new TomatoSauce(new ThreeCheesePizza());
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
        System.out.println("\n");
    }
}

