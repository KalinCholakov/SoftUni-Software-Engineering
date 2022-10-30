package workingWithAbstraction.exercises.ex05JediGalaxy;

public class Field {

    private final int[][] starsField;

    public Field(int row, int col) {
        this.starsField = new int[row][col];
        fillGalaxy(row, col, starsField);
    }

    private void fillGalaxy(int row, int col, int[][] galaxy) {
        int value = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                galaxy[i][j] = value++;
            }
        }
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && row < starsField.length && col >= 0 && col < starsField[row].length;
    }

    public int getValue(int row, int col) {
        return starsField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        starsField[row][col] = newValue;
    }

    public int getColLength() {
        return starsField[1].length;
    }
}
