package pattern.behavioral.iterator.drivers;

public class DriverLicensesApplication {
    public DriverLicensesApplication() {
        String[] licenses = {"LR", "HR", "HC", "MC"};
        TruckDriver driver = new TruckDriver("Bob", licenses);

        Iterator iterator = driver.getIterator();
        System.out.println("Driver " + driver.getName() + " has licenses: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
