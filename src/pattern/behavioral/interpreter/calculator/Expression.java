/**
 * Original: https://en.wikipedia.org/wiki/Interpreter_pattern#Java
 */
package pattern.behavioral.interpreter.calculator;

import java.util.Map;

public interface Expression {
    public int interpret(final Map<String,Expression> variables);
}
