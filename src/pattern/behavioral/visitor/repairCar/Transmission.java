package pattern.behavioral.visitor.repairCar;

public class Transmission implements CarElement {
    @Override
    public void tested(Mechanic mechanic) {
        mechanic.check(this);
    }
}
