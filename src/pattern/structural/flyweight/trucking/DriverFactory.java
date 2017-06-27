package pattern.structural.flyweight.trucking;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static final Map<String, Driver> drivers = new HashMap<>();

    public Driver getDriverByLicense(String license) {
        Driver driver = drivers.get(license);

        if (driver == null) {
            switch (license) {
                case "HC":
                    System.out.println("Hiring driver with HC license.");
                    driver = new HCDriver();
                    break;
                case "MC":
                    System.out.println("Hiring driver with MC license.");
                    driver = new MCDriver();
                    break;
            }
            drivers.put(license, driver);
        }
        return driver;
    }
}
