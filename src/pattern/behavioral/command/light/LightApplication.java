/**
 * Original: https://en.wikipedia.org/wiki/Command_pattern#Java
 */
package pattern.behavioral.command.light;

public class LightApplication {
    public LightApplication() {
        CommandFactory cf = CommandFactory.init();
        cf.executeCommand("Light on");
        cf.listCommands();
    }
}
