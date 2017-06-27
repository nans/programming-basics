package pattern.creational.factory.developer;

public class PhpDeveloper implements Developer {
    private String skills;

    public PhpDeveloper(String skills) {
        this.skills = skills;
    }

    @Override
    public void doJob() {
        System.out.println(skills + " write php code.");
    }
}
