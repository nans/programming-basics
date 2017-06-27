/*
 * Original: https://en.wikipedia.org/wiki/Composite_pattern
 */
package pattern.structural.composite.graphic;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    //Collection of child graphics.
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Prints the graphic.
    public void print() {
        childGraphics.forEach(Graphic::print);
    }

    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    //Removes the graphic from the composition.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
