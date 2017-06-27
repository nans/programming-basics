package pattern.structural.facade.freelanceWork;

public class FreelanceWorker {
    public void doJob(LaborExchange laborExchange){
        if(laborExchange.isSuggestedOrders()){
            System.out.println("Freelance worker is busy.");
        } else {
            System.out.println("Freelance worker is free.");
        }
    }

}
