package definingClasses.exercises.ex09CatLady;

public class Cymric extends Cat {

    public Cymric(String name, double specialParameter) {
        super(name, specialParameter);
    }

    @Override
    public String toString() {
        return "Cymric " + super.toString();
    }
}
