/**
 * Original: https://en.wikipedia.org/wiki/Interpreter_pattern#Java
 */
package pattern.behavioral.interpreter.calculator;

import java.util.HashMap;
import java.util.Map;

public class InterpreterApplication {
    public InterpreterApplication() {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<String, Expression>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
