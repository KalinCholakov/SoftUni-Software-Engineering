package generics.exercises.ex11Threeuple;

public class Threeuple<F, S, T> {
    private final F first;
    private final S second;
    private final T third;

    public Threeuple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", first, second, third);
    }
}
