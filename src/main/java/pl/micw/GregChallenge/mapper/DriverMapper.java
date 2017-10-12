package pl.micw.GregChallenge.mapper;

import org.springframework.stereotype.Component;
import pl.micw.GregChallenge.data.Driver;
import pl.micw.GregChallenge.dto.DriverDTO;

/**
 * Created by Mldz on 2017-10-08.
 */
@Component
public class DriverMapper {

    public DriverDTO mapToDTO(Driver driver) {
        DriverDTO driverDTO = new DriverDTO.Builder().setName(driver.getName()).build();
        driverDTO.setTeam(driver.getTeam());
        driverDTO.setAge(driver.getAge());
        return driverDTO;
    }


    public Driver mapFromDTO(DriverDTO driverDTO) {
        Driver driver = new Driver.Builder().setName(driverDTO.getName()).setTeam(driverDTO.getTeam()).setAge(driverDTO.getAge()).build();
        return driver;
    }

}
