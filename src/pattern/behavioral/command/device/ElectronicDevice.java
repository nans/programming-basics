/**
 * Author: Derek Banas
 * Original: http://www.newthinktank.com/2012/09/command-design-pattern-tutorial/
 */
package pattern.behavioral.command.device;

public interface ElectronicDevice {
    public void on();

    public void off();

    public void volumeUp();

    public void volumeDown();
}
