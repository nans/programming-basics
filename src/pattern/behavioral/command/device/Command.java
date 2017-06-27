/**
 * Author: Derek Banas
 * Original: http://www.newthinktank.com/2012/09/command-design-pattern-tutorial/
 */
package pattern.behavioral.command.device;

// Each command you want to issue will implement
// the Command interface

public interface Command {
    public void execute();
    // You may want to offer the option to undo a command
    public void undo();
}
