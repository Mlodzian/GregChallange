package pl.micw.GregChallenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.micw.GregChallenge.data.Driver;

import java.util.List;

/**
 * Created by Mldz on 2017-10-12.
 */
@RestController
public class DriverWebService {

    @Autowired
    DriverService driverService;


    @RequestMapping(value = "*", method = RequestMethod.GET)
    public List<Driver> greetPerson() {
        return driverService.getDrivers();
    }

    @RequestMapping(value = "*", method = RequestMethod.POST)
    public void addPerson(@RequestBody Driver driver) {
        driverService.addPerson(driver);
    }


}
