/**
 * Author: Derek Banas
 * Original: http://www.newthinktank.com/2012/09/command-design-pattern-tutorial/
 */
package pattern.behavioral.command.device;

import java.util.List;

public class TurnItAllOff implements Command {
    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    public void execute() {

        for (ElectronicDevice device : theDevices) {
            device.off();
        }

    }

    public void undo() {

        for (ElectronicDevice device : theDevices) {
            device.on();
        }

    }
}
