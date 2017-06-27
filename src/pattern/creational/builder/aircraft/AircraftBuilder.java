package pattern.creational.builder.aircraft;

public interface AircraftBuilder {
    public void setBehavior();
    public void buildWing();
    public void buildFuselage();
    public void buildKeel();
    public Aircraft getAircraft();
}
