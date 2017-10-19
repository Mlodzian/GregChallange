package pl.micw.GregChallenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.micw.GregChallenge.dto.DriverDTO;

import java.util.List;

/**
 * Created by Mldz on 2017-10-12.
 */
@RestController
public class DriverWebService {

    @Autowired
    DriverService driverService;

    @RequestMapping(value = "drivers", method = RequestMethod.GET)
    public List<DriverDTO> getDrivers() {
        return driverService.getDrivers();
    }

    @RequestMapping(value = "drivers", method = RequestMethod.POST)
    public void addDriver(@RequestBody DriverDTO driverDTO) {
        driverService.addPerson(driverDTO);
    }

}
