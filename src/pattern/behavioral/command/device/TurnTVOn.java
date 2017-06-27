/**
 * Author: Derek Banas
 * Original: http://www.newthinktank.com/2012/09/command-design-pattern-tutorial/
 */
package pattern.behavioral.command.device;

public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.on();

    }

    public void undo() {

        theDevice.off();

    }

}
