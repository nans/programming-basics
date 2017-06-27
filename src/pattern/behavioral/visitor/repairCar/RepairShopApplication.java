package pattern.behavioral.visitor.repairCar;

public class RepairShopApplication {
    public RepairShopApplication() {
        Car car = new Car();
        Mechanic newbie = new Newbie();
        Mechanic master = new Master();
        car.tested(newbie);
        car.tested(master);
    }
}
