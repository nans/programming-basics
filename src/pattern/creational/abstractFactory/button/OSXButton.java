/*
* Original: https://en.wikipedia.org/wiki/Abstract_factory_pattern#Java_example
*/
package pattern.creational.abstractFactory.button;

public class OSXButton implements IButton {
    public void paint() {
        System.out.println("OSX button");
    }
}
