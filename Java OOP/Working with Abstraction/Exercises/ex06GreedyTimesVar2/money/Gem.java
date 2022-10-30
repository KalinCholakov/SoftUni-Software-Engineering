package workingWithAbstraction.exercises.ex06GreedyTimesVar2.money;

public class Gem extends Money {
    private final String name;

    public Gem(String name, long price) {
        super(price);
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("##%s - %s", this.name, this.price);
    }

    public String getName() {
        return name;
    }
}
