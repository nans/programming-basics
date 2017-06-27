package pattern.behavioral.state.kid;

public class KidActivityApplication {
    public KidActivityApplication() {
        Activity activity = new Sleep();
        Kid kid = new Kid();

        kid.setActivity(activity);
        kid.doIt();

        kid.changeActivity();
        kid.doIt();

        kid.changeActivity();
        kid.doIt();
    }
}
