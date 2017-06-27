package pattern.creational.factory.developer;

public class FactoryDeveloperApplication {
    public FactoryDeveloperApplication() {
        DeveloperCreator factory = DeveloperFactory.GetCreatorByType("java");
        Developer javaMiddle = factory.makeDeveloper();
        javaMiddle.doJob();

        factory = DeveloperFactory.GetCreatorByType("php");
        Developer phpJunior = factory.makeDeveloper();
        phpJunior.doJob();
    }
}
