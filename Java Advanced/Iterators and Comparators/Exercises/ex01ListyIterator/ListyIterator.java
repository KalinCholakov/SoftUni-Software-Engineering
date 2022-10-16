package iteratorsAndComparators.exercises.ex01ListyIterator;

import java.util.List;

public class ListyIterator {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(String... elements) {
        this.elements = List.of(elements);
        currentIndex = 0;
    }

    public boolean move() {
        if (hasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public void print() {
        if (elements.size() != 0) {
            System.out.println(elements.get(currentIndex));
        } else {
            System.out.println("Invalid Operation!");
        }
    }

    public boolean hasNext() {
        return currentIndex < elements.size() - 1;
    }
}
