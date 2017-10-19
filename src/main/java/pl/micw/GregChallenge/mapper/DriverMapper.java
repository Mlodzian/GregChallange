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
        return DriverDTO.builder()
                .name(driver.getName())
                .team(driver.getTeam())
                .age(driver.getAge())
                .build();
    }


    public Driver mapFromDTO(DriverDTO driverDTO) {
        return Driver.builder()
                .name(driverDTO.getName())
                .team(driverDTO.getTeam())
                .age(driverDTO.getAge())
                .build();

    }

}
