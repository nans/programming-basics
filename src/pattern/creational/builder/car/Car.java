/*
* Original: //https://en.wikipedia.org/wiki/Builder_pattern#Java
*/
package pattern.creational.builder.car;

public class Car {
    private int wheels;
    private String color;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", color = " + color + "]";
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}
