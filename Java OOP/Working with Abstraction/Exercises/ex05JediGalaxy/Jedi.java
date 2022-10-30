package workingWithAbstraction.exercises.ex05JediGalaxy;

public class Jedi {
    private int row;
    private int col;

    public Jedi(int[] positions) {
        this.row = positions[0];
        this.col = positions[1];
    }
    public long move(Field field) {
        long starsCollected = 0;
        while (row >= 0 && col < field.getColLength()) {

            if (field.isInBounds(row, col)) {
                starsCollected += field.getValue(row, col);
            }

            col++;
            row--;
        }
        return starsCollected;
    }
}
