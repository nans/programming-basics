package pattern.creational.builder.aircraft;

public class AircraftFactory {
    private AircraftBuilder builder;

    public AircraftFactory(AircraftBuilder newBuilder){
        this.builder = newBuilder;
        createAircraft();
    }

    public void createAircraft(){
        builder.setBehavior();
        builder.buildFuselage();
        builder.buildKeel();
        builder.buildWing();
    }

    public Aircraft getAircraft(){
        return builder.getAircraft();
    }
}
