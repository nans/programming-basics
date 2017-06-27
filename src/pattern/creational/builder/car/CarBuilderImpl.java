/*
* Original: //https://en.wikipedia.org/wiki/Builder_pattern#Java
*/
package pattern.creational.builder.car;

public class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    public void setWheels(int wheels) {
        car.setWheels(wheels);
    }

    public void setColor(String color) {
        car.setColor(color);
    }

    public Car getResult() {
        return car;
    }
}
