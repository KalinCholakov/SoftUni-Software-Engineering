package iteratorsAndComparators.exercises.ex04Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake(Integer... elements) {
        lake = List.of(elements);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    class Frog implements Iterator<Integer> {

        private int index = 0;
        private boolean isFirstRoundFinished = false;

        @Override
        public boolean hasNext() {
            return index < lake.size();
        }

        @Override
        public Integer next() {
            Integer element = lake.get(index);
            index += 2;

            if (index >= lake.size() && !isFirstRoundFinished) {
                index = 1;
                isFirstRoundFinished = true;
            }
            return element;
        }
    }
}
