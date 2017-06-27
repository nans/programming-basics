package pattern.creational.factory.developer;

public class JavaDeveloper implements Developer {
    private String skills;
    public JavaDeveloper(String skills) {
        this.skills = skills;
    }

    @Override
    public void doJob() {
        System.out.println(skills + " write Java code.");
    }
}
