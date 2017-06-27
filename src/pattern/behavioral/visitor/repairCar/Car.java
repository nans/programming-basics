package pattern.behavioral.visitor.repairCar;

public class Car implements CarElement {
    private CarElement[] carElements;

    public Car() {
        this.carElements = new CarElement[]{
                new Engine(), new Transmission(), new Suspension()
        };
    }

    @Override
    public void tested(Mechanic mechanic) {
        for (CarElement carElement : carElements) {
            carElement.tested(mechanic);
        }
    }
}
