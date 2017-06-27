package pattern.behavioral.interpreter.vacancies;

public class InterpreterRunner {
    public InterpreterRunner() {
        Expression isJava = getJavaEx();
        Expression isJava2E = getJava2EEx();

        System.out.println("Know java core " + isJava.interpret("Java Core"));
        System.out.println("Know J2ee " + isJava2E.interpret("Java Spring"));
    }

    public static Expression getJavaEx() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJava2EEx() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }

}
