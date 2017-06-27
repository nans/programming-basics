package pattern.structural.bridge.schools;

public class PrimarySchool extends School {
    public PrimarySchool(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void workStatus() {
        System.out.println("Lessons are held in primary school.");
        teacher.doWork();
    }
}
