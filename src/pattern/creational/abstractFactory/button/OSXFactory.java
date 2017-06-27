/*
* Original: https://en.wikipedia.org/wiki/Abstract_factory_pattern#Java_example
*/
package pattern.creational.abstractFactory.button;

public class OSXFactory implements IGUIFactory {
    public IButton createButton() {
        return new OSXButton();
    }
}
