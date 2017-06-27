package pattern.behavioral.visitor.repairCar;

public interface Mechanic {
    void check(Engine engine);
    void check(Suspension suspension);
    void check(Transmission transmission);
}
