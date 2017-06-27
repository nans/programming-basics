package pattern.creational.builder.aircraft;

public class AircraftApplication {
    public AircraftApplication(){
        AircraftFactory firstFactory = new AircraftFactory(new WarPlaneBuilder());
        Aircraft cy27 = firstFactory.getAircraft();
        System.out.println("Cy-27: behavior " + cy27.getBehavior() + "; wings: " + cy27.getWing());

        AircraftFactory secondFactory = new AircraftFactory(new CivilAircraftBuilder());
        Aircraft airbusA380 = secondFactory.getAircraft();
        System.out.println("Airbus A380: behavior " + airbusA380.getBehavior() + "; wings: " + airbusA380.getWing());
    }
}
