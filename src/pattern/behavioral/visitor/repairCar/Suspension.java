package pattern.behavioral.visitor.repairCar;

public class Suspension implements CarElement {
    @Override
    public void tested(Mechanic mechanic) {
        mechanic.check(this);
    }
}
