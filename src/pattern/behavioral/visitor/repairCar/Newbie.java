package pattern.behavioral.visitor.repairCar;

public class Newbie implements Mechanic {
    @Override
    public void check(Engine engine) {
        System.out.println("Check the oil level.");
    }

    @Override
    public void check(Suspension suspension) {
        System.out.println("Check shock absorbers.");
    }

    @Override
    public void check(Transmission transmission) {
        System.out.println("Check transmission.");
    }
}
