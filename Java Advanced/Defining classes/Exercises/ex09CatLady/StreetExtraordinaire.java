package definingClasses.exercises.ex09CatLady;

public class StreetExtraordinaire extends Cat {

    public StreetExtraordinaire(String name, double specialParameter) {
        super(name, specialParameter);
    }

    @Override
    public String toString() {
        return "StreetExtraordinaire " + super.toString();
    }
}
