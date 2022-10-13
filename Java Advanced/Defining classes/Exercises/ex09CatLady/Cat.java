package definingClasses.exercises.ex09CatLady;

public class Cat {
    private String name;
    private double specialParameter;

    public Cat(String name, double specialParameter) {
        this.name = name;
        this.specialParameter = specialParameter;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", name, specialParameter);
    }
}
