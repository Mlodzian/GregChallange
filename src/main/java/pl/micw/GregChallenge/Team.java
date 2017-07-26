package pl.micw.GregChallenge;

/**
 * Created by Mldz on 2017-07-26.
 */
public enum Team {
    FERRARI("Ferrari"),
    MCLAREN("United Kingdom McLare"),
    REDBULL("Austria Red Bul"),
    MERCEDES("Germany Mercede"),
    WILLIAMS("United Kingdom William"),
    LOTUS("United Kingdom Lotu"),
    RENAULT("France Renaul");


    Team(String name){
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
