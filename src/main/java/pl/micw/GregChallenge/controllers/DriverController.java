package pl.micw.GregChallenge.controllers;

import org.springframework.web.bind.annotation.RestController;
import pl.micw.GregChallenge.data.Driver;
import pl.micw.GregChallenge.dto.DriverDTO;
import pl.micw.GregChallenge.mapper.DriverMapper;

/**
 * Created by Mldz on 2017-07-24.
 */
@RestController
public class DriverController {

    DriverMapper mapper = new DriverMapper();

    public DriverDTO mapDriverToDTO(Driver driver) {
        return mapper.mapToDTO(driver);
    }

    public Driver mapFromDriverDTO(DriverDTO driverDTO) {
        return mapper.mapFromDTO(driverDTO);
    }


}
