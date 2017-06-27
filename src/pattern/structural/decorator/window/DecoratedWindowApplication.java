/*
 * Original: https://en.wikipedia.org/wiki/Decorator_pattern#Java
 */
package pattern.structural.decorator.window;

public class DecoratedWindowApplication {
    public DecoratedWindowApplication() {
        System.out.println("DecoratedWindowApplication");
        // Create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator (
                new VerticalScrollBarDecorator (new BaseWindow()));

        // Print the Window's description
        System.out.println(decoratedWindow.getDescription());
        System.out.println("\n");
    }
}
