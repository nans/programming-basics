package pattern.creational.factory.developer;

public class DeveloperFactory {
    public static DeveloperCreator GetCreatorByType(String type) {
            if (type.equals("java")) {
                return new JavaDeveloperCreator();
            } else if (type.equals("php")) {
                return new PhpDeveloperCreator();
            }
        return null;
    }
}
