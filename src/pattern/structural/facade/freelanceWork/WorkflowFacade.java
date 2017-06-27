package pattern.structural.facade.freelanceWork;

public class WorkflowFacade {
    private FreelanceWorker worker = new FreelanceWorker();
    private LaborExchange laborExchange = new LaborExchange();

    public void checkWorker() {
        if (!laborExchange.isSuggestedOrders()) {
            laborExchange.addOrder();
        }
        worker.doJob(laborExchange);
    }
}
