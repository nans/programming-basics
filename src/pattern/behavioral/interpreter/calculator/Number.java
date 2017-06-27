/**
 * Original: https://en.wikipedia.org/wiki/Interpreter_pattern#Java
 */
package pattern.behavioral.interpreter.calculator;

import java.util.Map;

public class Number implements Expression {
    private int number;
    public Number(final  int number){
        this.number = number;
    }

    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
