package pattern.structural.facade.freelanceWork;

public class FreelanceApplication {
    public FreelanceApplication() {
        WorkflowFacade workflowFacade = new WorkflowFacade();
        workflowFacade.checkWorker();
    }
}
