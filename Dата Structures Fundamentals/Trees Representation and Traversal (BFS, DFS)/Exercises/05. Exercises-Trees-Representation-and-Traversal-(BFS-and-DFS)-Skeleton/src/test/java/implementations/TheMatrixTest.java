package implementations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheMatrixTest {

    @Test
    public void testZeroTestOne() {
        char[][] matrix = {
                {'a', 'a', 'a'},
                {'a', 'a', 'a'},
                {'a', 'b', 'a'},
                {'a', 'b', 'a'},
                {'a', 'b', 'a'}
        };
        char fillChar = 'x';
        int startRow = 0;
        int startCol = 0;

        TheMatrix theMatrix = new TheMatrix(matrix, fillChar, startRow, startCol);

        theMatrix.solve();

        String str = theMatrix.toOutputString();
        assertEquals(
                "xxx\n" +
                        "xxx\n" +
                        "xbx\n" +
                        "xbx\n" +
                        "xbx", str);
    }

    @Test
    public void testZeroTestTwo() {
        char[][] matrix = {
                {'a', 'a', 'a',},
                {'a', 'a', 'a',},
                {'a', 'b', 'a',},
                {'a', 'b', 'a',},
                {'a', 'b', 'a',}

        };
        char fillChar = 'x';
        int startRow = 2;
        int startCol = 1;

        TheMatrix theMatrix = new TheMatrix(matrix, fillChar, startRow, startCol);

        theMatrix.solve();

        String str = theMatrix.toOutputString();
        assertEquals(
                "aaa\n" +
                        "aaa\n" +
                        "axa\n" +
                        "axa\n" +
                        "axa", str);
    }

    @Test
    public void testZeroTestThree() {
        char[][] matrix = {
                {'o', 'o', '1', '1', 'o', 'o'},
                {'o', '1', 'o', 'o', '1', 'o'},
                {'1', 'o', 'o', 'o', 'o', '1'},
                {'o', '1', 'o', 'o', '1', 'o'},
                {'o', 'o', '1', '1', 'o', 'o'}
        };
        char fillChar = '3';
        int startRow = 2;
        int startCol = 1;

        TheMatrix theMatrix = new TheMatrix(matrix, fillChar, startRow, startCol);

        theMatrix.solve();

        String str = theMatrix.toOutputString();
        assertEquals(
                "oo11oo\n" +
                        "o1331o\n" +
                        "133331\n" +
                        "o1331o\n" +
                        "oo11oo", str);
    }

    @Test
    public void testZeroTestFour() {
        char[][] matrix = {
                {'o', 'o', 'o', 'o', 'o', 'o'},
                {'o', 'o', 'o', '1', 'o', 'o'},
                {'o', 'o', '1', 'o', '1', '1'},
                {'o', '1', '1', 'w', '1', 'o'},
                {'1', 'o', 'o', 'o', 'o', 'o'}
        };
        char fillChar = 'z';
        int startRow = 4;
        int startCol = 1;

        TheMatrix theMatrix = new TheMatrix(matrix, fillChar, startRow, startCol);

        theMatrix.solve();

        String str = theMatrix.toOutputString();
        assertEquals(
                "oooooo\n" +
                        "ooo1oo\n" +
                        "oo1o11\n" +
                        "o11w1z\n" +
                        "1zzzzz", str);
    }

    @Test
    public void testZeroTestFive() {
        char[][] matrix = {
                {'o', '1', 'o', 'o', '1', 'o'},
                {'o', '1', 'o', 'o', '1', 'o'},
                {'o', '1', '1', '1', '1', 'o'},
                {'o', '1', 'o', 'w', '1', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'o'}
        };
        char fillChar = 'z';
        int startRow = 4;
        int startCol = 0;

        TheMatrix theMatrix = new TheMatrix(matrix, fillChar, startRow, startCol);

        theMatrix.solve();

        String str = theMatrix.toOutputString();
        assertEquals(
                "z1oo1z\n" +
                        "z1oo1z\n" +
                        "z1111z\n" +
                        "z1zw1z\n" +
                        "zzzzzz", str);
    }
}