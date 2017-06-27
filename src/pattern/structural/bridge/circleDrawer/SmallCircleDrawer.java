/*
* Original: https://en.wikipedia.org/wiki/Bridge_pattern
*/
package pattern.structural.bridge.circleDrawer;

public class SmallCircleDrawer implements  Drawer {
    public static final double radiusMultiplier = 0.25;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
    }
}
