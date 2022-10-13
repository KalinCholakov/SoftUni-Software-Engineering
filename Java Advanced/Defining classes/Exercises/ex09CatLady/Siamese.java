package definingClasses.exercises.ex09CatLady;

public class Siamese extends Cat {

    public Siamese(String name, double specialParameter) {
        super(name, specialParameter);
    }

    @Override
    public String toString() {
        return "Siamese " + super.toString();
    }
}
