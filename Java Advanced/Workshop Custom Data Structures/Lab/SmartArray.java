package workshopCustomDataStructures;

import java.util.function.Consumer;

public class SmartArray<T> {
    private static final int INITIAL_SIZE = 4;
    private Object[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new Object[INITIAL_SIZE];
        this.capacity = INITIAL_SIZE;
        this.size = 0;
    }

    public void add(T element) {
        if (size == data.length) {
            data = grow();
        }

        data[size++] = element;
    }

    private Object[] grow() {
        int newLength = data.length * 2;

        Object[] newData = new Object[newLength];

//        for (int i = 0; i < data.length; i++) {
//            newData[i] = data[i];
//        }
        System.arraycopy(data, 0, newData, 0, data.length);

        return newData;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        ensureIndex(index);

        return (T) data[index];
    }

    private void ensureIndex(int index) {
        if (index < 0 || index >= size) {
            String message = String.format("Index %d out of bounds for length %d",
                    index, size);
            throw new IndexOutOfBoundsException(message);
        }
    }

    public T remove(int index) {
        T removedElement = get(index);
        shiftIndex(index);
        size--;

        if (size <= capacity / 4) {
            shrink();
        }

        return removedElement;
    }

    private void shiftIndex(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = 0;
    }

    private void shrink() {
        capacity /= 2;
        Object[] newData = new Object[capacity];

        System.arraycopy(data, 0, newData, 0, size);

        data = newData;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            T current = get(i);
            if (element.equals(current)) {
                return true;
            }
        }

        return false;
    }

    public void add(int index, T element) {
        T lastElement = get(size - 1);

//        for (int i = size - 1; i > index; i--) {
//            data[i] = data[i - 1];
//        }
        if (size - 1 - index >= 0) {
            System.arraycopy(data, index, data, index + 1, size - 1 - index);
        }

        data[index] = element;

        add(lastElement);
    }

    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }
}
