package pattern.structural.facade.freelanceWork;

public class LaborExchange {
    private Boolean orderIsActive = false;

    public Boolean isSuggestedOrders() {
        return orderIsActive;
    }

    public void addOrder() {
        System.out.println("Added new order!");
        orderIsActive = true;
    }

    public void removeOrder() {
        System.out.println("Completed the order!");
        orderIsActive = false;
    }
}
