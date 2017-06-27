/*
* Original: https://en.wikipedia.org/wiki/Abstract_factory_pattern#Java_example
*/
package pattern.creational.abstractFactory.button;

public class WinFactory implements IGUIFactory {

    public IButton createButton() {
        return new WinButton();
    }
}
