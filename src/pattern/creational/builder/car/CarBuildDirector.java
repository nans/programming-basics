/*
* Original: //https://en.wikipedia.org/wiki/Builder_pattern#Java
*/
package pattern.creational.builder.car;

public class CarBuildDirector {
    private CarBuilder builder;

    public CarBuildDirector(final CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructRedCar() {
        builder.setWheels(4);
        builder.setColor("Red");
        return builder.getResult();
    }

    public Car constructGreenCar() {
        builder.setWheels(4);
        builder.setColor("Green");
        return builder.getResult();
    }

    public static void main(final String[] arguments) {
        CarBuilder builder = new CarBuilderImpl();
        CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.constructRedCar());
    }
}
