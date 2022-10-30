package workingWithAbstraction.exercises.ex05JediGalaxy;

public class Galaxy {
    private final Field field;
    private final Jedi jedi;
    private final EvilPower evilPower;

    public Galaxy(Field field, Jedi jedi) {
        this.field = field;
        this.jedi = jedi;
        evilPower = new EvilPower();
    }

    public long moveJedi() {
        return jedi.move(field);
    }

    public void moveEvil(int rowEvil, int colEvil) {
        evilPower.moveEvil(rowEvil, colEvil, field);
    }
}
