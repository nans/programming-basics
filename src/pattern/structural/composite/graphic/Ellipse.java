/*
 * Original: https://en.wikipedia.org/wiki/Composite_pattern
 */
package pattern.structural.composite.graphic;
//Leaf
public class Ellipse implements Graphic {
    public void print(){
        System.out.println("Ellipse");
    }
}
