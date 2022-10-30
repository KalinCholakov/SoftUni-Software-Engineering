package workingWithAbstraction.exercises.ex06GreedyTimesVar2.money;

public class Cash extends Money {
    private final String name;

    public Cash(String name, long price) {
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
