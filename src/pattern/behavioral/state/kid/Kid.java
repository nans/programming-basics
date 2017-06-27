package pattern.behavioral.state.kid;

public class Kid {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleep) {
            setActivity(new Eat());
        } else if (activity instanceof Eat) {
            setActivity(new Read());
        }
    }

    public void doIt() {
        activity.doIt();
    }
}
