package pl.micw.GregChallenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import pl.micw.GregChallenge.controllers.DriverController;
import pl.micw.GregChallenge.data.Driver;
import pl.micw.GregChallenge.data.Team;
import pl.micw.GregChallenge.dto.DriverDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mldz on 2017-07-24.
 */
@Repository
public class DriverService {

    @Autowired
    DriverController driverController;

    List<DriverDTO> driverList = new ArrayList<>();

    {
        driverList.add(new DriverDTO.Builder().setName("Rober Kubica").setAge(32).setTeam(Team.RENAULT).build());
        driverList.add(new DriverDTO.Builder().setName("Lewis Hamilton").setTeam(Team.MERCEDES).setAge(32).build());
        driverList.add(new DriverDTO.Builder().setName("Nico Rosberg").setTeam(Team.MERCEDES).setAge(32).build());
        driverList.add(new DriverDTO.Builder().setName("Daniel Ricciardo").setTeam(Team.REDBULL).setAge(28).build());
        driverList.add(new DriverDTO.Builder().setName("Michaello Cwiekaello").setTeam(Team.ISS).setAge(25).build());
    }

    private List<DriverDTO> driverInitializator() {
        return driverList;
    }

    public List<Driver> getDrivers() {
        return driverInitializator().stream().map(t -> driverController.mapFromDriverDTO(t)).collect(Collectors.toList());
    }

    public void addPerson(@PathVariable Driver driver) {
        driverList.add(driverController.mapDriverToDTO(driver));
    }

}
