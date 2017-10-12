package pl.micw.GregChallenge.dto;

import pl.micw.GregChallenge.data.Team;

/**
 * Created by Mldz on 2017-07-26.
 */
public class DriverDTO {

    private String name;
    private int age;
    private Team team;

    private DriverDTO(Builder driverBuilder) {
        team = driverBuilder.team;
        age = driverBuilder.age;
        name = driverBuilder.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setAge(int age) {

        this.age = age;
    }

    @Override
    public String toString() {
        return "DriverDTO {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team=" + team +
                '}';
    }

    public static class Builder {

        private String name;
        private int age;
        private Team team;

        public Builder() {
        }

        public DriverDTO build() {
            return new DriverDTO(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setTeam(Team team) {
            this.team = team;
            return this;
        }


    }
}
