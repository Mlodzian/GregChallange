package pl.micw.GregChallenge;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mldz on 2017-07-24.
 */
@RestController
public class DriverController {

    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Driver> getDrivers() {
        List<Driver> driverList = new ArrayList<>();
        driverList.add(new Driver.Builder().setName("Rober Kubica").setAge(32).setTeam(Team.RENAULT).build());
        driverList.add(new Driver.Builder().setName("Lewis Hamilton").setTeam(Team.MERCEDES).setAge(32).build());
        driverList.add(new Driver.Builder().setName("Nico Rosberg").setTeam(Team.MERCEDES).setAge(32).build());
        driverList.add(new Driver.Builder().setName("Daniel Ricciardo").setTeam(Team.REDBULL).setAge(28).build());

        return driverList;
    }


}
