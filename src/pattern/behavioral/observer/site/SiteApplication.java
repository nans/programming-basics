package pattern.behavioral.observer.site;

public class SiteApplication {
    public SiteApplication() {
        Site site = new Site();

        site.addVacancy("For Jun");
        site.addVacancy("For Middle");
        site.addVacancy("For Sir");

        Observer alex = new Subscriber("Alex");
        Observer bob = new Subscriber("Bob");

        site.addObserver(alex);
        site.addObserver(bob);

        site.addVacancy("New for jun");
        site.removeVacancy("For Middle");
    }
}
