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
public class ListController {

    @RequestMapping("/dupa")
    public String index() {
        List<Driver> driverList = new ArrayList<>();
        Driver kubica = new Driver.Builder().setName("Rober Kubica").setAge(32).setTeam(Team.RENAULT).build();
        Driver Hamilton = new Driver.Builder().setName("Lewis Hamilton").setTeam(Team.MERCEDES).setAge(32).build();
        Driver Rosberg = new Driver.Builder().setName("Nico Rosberg").setTeam(Team.MERCEDES).setAge(32).build();
        Driver Ricciardo = new Driver.Builder().setName("Daniel Ricciardo").setTeam(Team.REDBULL).setAge(28).build();
        return "DUPA!";
    }

//    @RequestMapping(value = "drivers", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
//    @ResponseBody
//    public List<Driver> printDrivers(@RequestBody PersonWrapper wrapper) {
//        List<String> response = new ArrayList<String>();
//        for (Person person : wrapper.getPersons()) {
//            personService.save(person);
//            response.add("Saved person: " + person.toString());
//        }
//        return response;
//    }

    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    public @ResponseBody List<Driver> getDrivers() {
        List<Driver> driverList = new ArrayList<>();
        driverList.add(new Driver.Builder().setName("Rober Kubica").setAge(32).setTeam(Team.RENAULT).build());
        driverList.add(new Driver.Builder().setName("Lewis Hamilton").setTeam(Team.MERCEDES).setAge(32).build());
        driverList.add(new Driver.Builder().setName("Nico Rosberg").setTeam(Team.MERCEDES).setAge(32).build());
        driverList.add(new Driver.Builder().setName("Daniel Ricciardo").setTeam(Team.REDBULL).setAge(28).build());

        return driverList;
    }

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    String sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return "siema!";
    }

}
