package pl.micw.GregChallenge.components;

import org.springframework.stereotype.Component;
import pl.micw.GregChallenge.data.Driver;
import pl.micw.GregChallenge.dto.DriverDTO;
import pl.micw.GregChallenge.mapper.DriverMapper;

/**
 * Created by Mldz on 2017-07-24.
 */
@Component
public class DriverComponent {

    DriverMapper mapper = new DriverMapper();

    public DriverDTO mapDriverToDTO(Driver driver) {
        return mapper.mapToDTO(driver);
    }

    public Driver mapFromDriverDTO(DriverDTO driverDTO) {
        return mapper.mapFromDTO(driverDTO);
    }


}
