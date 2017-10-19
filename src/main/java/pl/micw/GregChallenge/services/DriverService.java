package pl.micw.GregChallenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import pl.micw.GregChallenge.components.DriverComponent;
import pl.micw.GregChallenge.data.Driver;
import pl.micw.GregChallenge.data.Team;
import pl.micw.GregChallenge.dto.DriverDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by Mldz on 2017-07-24.
 */
@Service
public class DriverService {

    @Autowired
    DriverComponent driverController;

    List<Driver> driverList = Collections.synchronizedList(new ArrayList<>());

    {
        driverList.add(Driver.builder().name("Rober Kubica").team(Team.RENAULT).age(32).build());
        driverList.add(Driver.builder().name("Lewis Hamilton").team(Team.MERCEDES).age(32).build());
        driverList.add(Driver.builder().name("Nico Rosberg").team(Team.MERCEDES).age(32).build());
        driverList.add(Driver.builder().name("Daniel Ricciardo").team(Team.REDBULL).age(28).build());
        driverList.add(Driver.builder().name("Michaello Cwiekaello").team(Team.ISS).age(25).build());
    }

    private List<Driver> driverInitializator() {
        return driverList;
    }

    public List<DriverDTO> getDrivers() {
        return driverInitializator().stream().map(t -> driverController.mapDriverToDTO(t)).collect(toList());
    }

    public void addPerson(DriverDTO driverDTO) {
        driverList.add(driverController.mapFromDriverDTO(driverDTO));
    }

}
