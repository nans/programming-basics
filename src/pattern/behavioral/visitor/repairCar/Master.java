package pattern.behavioral.visitor.repairCar;

public class Master implements Mechanic {
    @Override
    public void check(Engine engine) {
        System.out.println("Check engine elements and errors;");

    }

    @Override
    public void check(Suspension suspension) {
        System.out.println("Carefully check the suspension;");
    }

    @Override
    public void check(Transmission transmission) {
        System.out.println("Carefully check the transmission;");
    }
}
