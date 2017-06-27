package pattern.creational.builder.aircraft;

public class CivilAircraftBuilder implements AircraftBuilder {
    private Aircraft civilPlane;

    public CivilAircraftBuilder() {
        civilPlane = new Aircraft();
    }

    public void setBehavior() {
        civilPlane.setBehavior("civil");
    }

    public void buildWing() {
        civilPlane.setWing("79.75m");
    }

    public void buildFuselage() {
        civilPlane.setFuselage("center section and panel");
    }

    public void buildKeel() {
        civilPlane.setKeel("composite unit");
    }

    public Aircraft getAircraft() {
        return civilPlane;
    }
}
