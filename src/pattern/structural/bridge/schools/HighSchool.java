package pattern.structural.bridge.schools;

public class HighSchool extends School {
    public HighSchool(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void workStatus() {
        System.out.println("Lessons are held in high school.");
        teacher.doWork();
    }
}
