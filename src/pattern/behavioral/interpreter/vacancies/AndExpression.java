package pattern.behavioral.interpreter.vacancies;

public class AndExpression implements Expression {
    private Expression value1;
    private Expression value2;

    public AndExpression(Expression value1, Expression value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean interpret(String context) {
        return value1.interpret(context) && value2.interpret(context);
    }
}
