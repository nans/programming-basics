package pattern.creational.factory.developer;

public class JavaDeveloperCreator implements DeveloperCreator {
    @Override
    public Developer makeDeveloper() {
        return new JavaDeveloper("Middle");
    }
}
