package pattern.creational.builder.aircraft;

public class WarPlaneBuilder implements AircraftBuilder {
    private Aircraft warPlane;

    public WarPlaneBuilder() {
        warPlane = new Aircraft();
    }

    public void setBehavior() {
        warPlane.setBehavior("military");
    }

    public void buildWing() {
        warPlane.setWing("12.7m");
    }

    public void buildFuselage() {
        warPlane.setFuselage("single support body");
    }

    public void buildKeel() {
        warPlane.setKeel("integrated circuit");
    }

    public Aircraft getAircraft() {
        return warPlane;
    }
}
