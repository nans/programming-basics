package pattern.structural.bridge.schools;

public class SchoolApplication {
    public SchoolApplication() {
        School[] schools = {new HighSchool(new MathematicTeacher()), new PrimarySchool(new EnglishTeacher())};
        for (School job : schools) {
            job.workStatus();
        }
    }
}
