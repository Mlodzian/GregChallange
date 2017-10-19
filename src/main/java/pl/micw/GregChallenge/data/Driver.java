package pl.micw.GregChallenge.data;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Mldz on 2017-07-26.
 */

@Data
@Builder
public class Driver {

    private String name;
    private int age;
    private Team team;

}
