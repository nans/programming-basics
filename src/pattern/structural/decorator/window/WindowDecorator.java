/*
 * Original: https://en.wikipedia.org/wiki/Decorator_pattern#Java
 */
package pattern.structural.decorator.window;

abstract class WindowDecorator implements Window {
    protected Window windowToBeDecorated; // the Window being decorated

    public WindowDecorator (Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void draw() {
        windowToBeDecorated.draw(); //Delegation
    }

    public String getDescription() {
        return windowToBeDecorated.getDescription(); //Delegation
    }
}
