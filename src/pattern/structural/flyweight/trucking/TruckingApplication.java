package pattern.structural.flyweight.trucking;

import java.util.ArrayList;
import java.util.List;

public class TruckingApplication {
    public TruckingApplication(){
        DriverFactory driverHRCompany = new DriverFactory();
        List<Driver> drivers = new ArrayList<>();
        drivers.add(driverHRCompany.getDriverByLicense("HC"));
        drivers.add(driverHRCompany.getDriverByLicense("MC"));

        drivers.forEach(Driver::checkTheLicense);
    }

}
