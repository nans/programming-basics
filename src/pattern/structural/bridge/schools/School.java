package pattern.structural.bridge.schools;

public abstract class School {
    protected Teacher teacher;

    protected School(Teacher newTeacher){
        this.teacher = newTeacher;
    }

    public abstract void workStatus();
}
