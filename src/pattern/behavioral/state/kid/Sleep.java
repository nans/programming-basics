package pattern.behavioral.state.kid;

public class Sleep implements Activity {
    @Override
    public void doIt() {
        System.out.println("Sleep!");
    }
}
