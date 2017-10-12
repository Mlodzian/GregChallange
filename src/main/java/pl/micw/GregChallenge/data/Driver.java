package pl.micw.GregChallenge.data;

/**
 * Created by Mldz on 2017-07-26.
 */
public class Driver {

    private String name;
    private int age;
    private Team team;

    public Driver() {
    }

    private Driver(Builder driverBuilder) {
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

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Driver {" +
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

        public Driver build() {
            return new Driver(this);
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
