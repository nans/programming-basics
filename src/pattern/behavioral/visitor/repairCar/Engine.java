package pattern.behavioral.visitor.repairCar;

public class Engine implements CarElement {
    @Override
    public void tested(Mechanic mechanic) {
        mechanic.check(this);
    }
}
