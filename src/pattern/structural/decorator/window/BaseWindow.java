/*
 * Original: https://en.wikipedia.org/wiki/Decorator_pattern#Java
 */
package pattern.structural.decorator.window;

public class BaseWindow implements Window {
    public void draw() {
        // Draw window
    }

    public String getDescription() {
        return "simple window";
    }
}
