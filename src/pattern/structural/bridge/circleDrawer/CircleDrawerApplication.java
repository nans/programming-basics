/*
* Original: https://en.wikipedia.org/wiki/Bridge_pattern
*/
package pattern.structural.bridge.circleDrawer;

public class CircleDrawerApplication {
    public CircleDrawerApplication() {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())};

        for (Shape next : shapes) {
            next.draw();
        }
    }
}
