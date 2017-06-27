/*
* Original: https://en.wikipedia.org/wiki/Bridge_pattern
*/
package pattern.structural.bridge.circleDrawer;

public interface Drawer {
    public void drawCircle(int x, int y, int radius);
}
