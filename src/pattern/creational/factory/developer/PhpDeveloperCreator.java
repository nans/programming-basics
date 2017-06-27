package pattern.creational.factory.developer;

public class PhpDeveloperCreator implements DeveloperCreator {
    @Override
    public Developer makeDeveloper() {
        return new PhpDeveloper("Junior");
    }
}
