/**
 * Original: https://en.wikipedia.org/wiki/Command_pattern#Java
 */
package pattern.behavioral.command.light;

/**
 * The Command functional interface.
 */
@FunctionalInterface
public interface Command {
    public void apply();
}
