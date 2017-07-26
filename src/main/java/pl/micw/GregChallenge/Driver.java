package pl.micw.GregChallenge;

/**
 * Created by Mldz on 2017-07-26.
 */
public class Driver {

    private String name;
    private int age;
    private Team team;

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

    @Override
    public String toString() {
        return "Driver {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team=" + team +
                '}';
    }

    static class Builder {

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
