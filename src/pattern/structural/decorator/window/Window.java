/*
 * Original: https://en.wikipedia.org/wiki/Decorator_pattern#Java
 */
package pattern.structural.decorator.window;

public interface Window {
    public void draw(); // Draws the Window
    public String getDescription(); // Returns a description of the Window
}
