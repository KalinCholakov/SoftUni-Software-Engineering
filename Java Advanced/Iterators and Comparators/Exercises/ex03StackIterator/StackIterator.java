package iteratorsAndComparators.exercises.ex03StackIterator;

import java.util.ArrayDeque;
import java.util.Iterator;

public class StackIterator implements Iterable<Integer> {
    private ArrayDeque<Integer> stack;

    public StackIterator() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int element) {
        this.stack.push(element);
    }

    public void push(int[] elements) {
        for (int element : elements) {
            this.stack.push(element);
        }
    }

    public void pop() {
        if (this.stack.isEmpty()) {
            System.out.println("No elements");
            return;
        }
        this.stack.pop();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private ArrayDeque<Integer> tempStack = new ArrayDeque<>(stack);

            @Override
            public boolean hasNext() {
                return !tempStack.isEmpty();
            }

            @Override
            public Integer next() {
                return tempStack.pop();
            }
        };
    }
}
