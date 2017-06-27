/*
* Original: //https://en.wikipedia.org/wiki/Builder_pattern#Java
*/
package pattern.creational.builder.car;

public interface CarBuilder {
    void setWheels(final int wheels);

    void setColor(final String color);

    Car getResult();
}
