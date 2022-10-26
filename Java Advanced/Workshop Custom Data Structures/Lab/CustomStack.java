package workshopCustomDataStructures;

import java.util.function.Consumer;

/**
 * Custom implementation of LIFO data structure
 */

public class CustomStack<T> {

    private static class Node<E> {
        private final E element;
        private Node<E> prev;

        private Node(E element) {
            this.element = element;
        }
    }

    private Node<T> top;
    private int size;

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.prev = top;
        top = newNode;
        size++;
    }

    public T pop() {
        ensureNotEmpty();

        T value = top.element;
        top = top.prev;
        size--;
        return value;
    }

    private void ensureNotEmpty() {
        if (top == null) {
            throw new IllegalArgumentException("CustomStack is empty!");
        }
    }

    public T peek() {
        ensureNotEmpty();
        return top.element;
    }

    public void forEach(Consumer<T> consumer) {

        Node<T> current = top;

        while (current != null) {
            consumer.accept(current.element);
            current = current.prev;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
