package implementations;

import java.util.Iterator;

public class ReversedList<E> implements Iterable<E> {
    private static final int INITIAL_SIZE = 2;
    private Object[] elements;
    private int size;
    private int capacity;

    public ReversedList() {
        this.elements = new Object[INITIAL_SIZE];
        this.size = 0;
        this.capacity = INITIAL_SIZE;
    }

    public void add(E element) {
        if (this.size == capacity) {
            grow();
        }
        this.elements[this.size++] = element;
    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public E get(int index) {
        ensureIndex(index);

        return (E) this.elements[size - index - 1];
    }

    public void removeAt(int index) {
        ensureIndex(index);

        for (int i = this.size - index - 1; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.elements[size - 1] = null;
        this.size--;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return get(index++);
            }
        };
    }

    private void grow() {
        this.capacity *= 2;
        Object[] temp = new Object[capacity];

        System.arraycopy(this.elements, 0, temp, 0, this.elements.length);

        this.elements = temp;
    }

    private boolean validIndex(int index) {
        return index >= 0 && index <= this.size - 1;
    }

    private void ensureIndex(int index) {
        if (!validIndex(index)) {
            throw new IndexOutOfBoundsException(
                    "Cannot get index " + index + " on ArrayList with " + this.size + " elements");
        }
    }
}
