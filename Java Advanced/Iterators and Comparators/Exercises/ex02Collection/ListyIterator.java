package iteratorsAndComparators.exercises.ex02Collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable {
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

    @Override
    public Iterator iterator() {
        return new Iterator() {

            private int internalIndex = 0;

            @Override
            public boolean hasNext() {
                return internalIndex < elements.size();
            }

            @Override
            public Object next() {
                return elements.get(internalIndex++);
            }
        };
    }

    public void printAll() {
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
