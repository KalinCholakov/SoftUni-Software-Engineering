package workingWithAbstraction.lab.ex01RhombusOfStars;

public class Rhombus {
    private final int n;

    public Rhombus(int n) {
        this.n = n;
    }

    public String getRhombus() {
        return getTop() +
                getMiddle() +
                getBottom();
    }

    private String getTop() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            stringBuilder.append(repeatAndPrintStrings(n - i, " "))
                    .append(repeatAndPrintStrings(i, "* "))
                    .append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    private String getMiddle() {
        return String.format(repeatAndPrintStrings(n, "* ") + System.lineSeparator());
    }

    private String getBottom() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            stringBuilder.append(repeatAndPrintStrings(i, " "))
                    .append(repeatAndPrintStrings(n - i, "* "))
                    .append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    private String repeatAndPrintStrings(int count, String string) {
        return string.repeat(count);
    }
}
