/*
* Original: https://en.wikipedia.org/wiki/Bridge_pattern
*/
package pattern.structural.bridge.circleDrawer;

public abstract class Shape {
    protected  Drawer drawer;
    protected Shape(Drawer drawer){
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract  void enlargeRadius(int multiplier);
}
