package pl.micw.GregChallenge.dto;

import lombok.Builder;
import lombok.Data;
import pl.micw.GregChallenge.data.Team;

/**
 * Created by Mldz on 2017-07-26.
 */

@Data
@Builder
public class DriverDTO {

    private String name;
    private int age;
    private Team team;

}
