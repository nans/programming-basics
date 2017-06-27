package pattern.behavioral.memento.git;

public class SaveApplication {
    public SaveApplication() {
        Project project = new Project();
        Repo repo = new Repo();
        project.setVersionAndDate("1");
        repo.setSave(project.save());
        project.setVersionAndDate("2");
    }
}
