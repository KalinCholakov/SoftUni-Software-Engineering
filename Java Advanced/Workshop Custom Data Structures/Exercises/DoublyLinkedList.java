package workshopCustomDataStructures.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoublyLinkedList {

    private static class Node {
        private final int value;
        private Node next;
        private Node prev;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int element) {

        Node newNode = new Node(element);

        if (!isEmpty()) {
            newNode.next = head;
            head.prev = newNode;
        } else {
            tail = newNode;
        }

        head = newNode;
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int element) {
        if (isEmpty()) {
            addFirst(element);
            return;
        }

        Node newNode = new Node(element);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int get(int index) {
        ensureIndex(index);

        int currentIndex = 0;

        Node currentNode;

        if (currentIndex > size / 2) {
            currentNode = tail;
            int lastIndex = size - 1;
            int countOfIterations = lastIndex - index;

            for (int i = 0; i < countOfIterations; i++) {
                currentNode = currentNode.prev;
            }

        } else {
            currentNode = head;

            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
        }

        return currentNode.value;
    }

    private void ensureIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("No such index index in the list!");
        }
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Can not remove from empty list!");
        }

        int removedElement = head.value;
        size--;
        head = head.next;

        if (size > 1) {
            head.prev = null;
        }

        if (isEmpty()) {
            head = null;
            tail = null;
        }

        return removedElement;
    }

    public int removeLast() {
        if (size < 2) {
            return removeFirst();
        }

        int removedElement = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;

        return removedElement;
    }

    public void forEach(Consumer<Integer> consumer) {

        Node currentNode = head;

        while (currentNode != null) {
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public int[] toArray() {

        List<Integer> result = new ArrayList<>();

        forEach(result::add);

        return result.stream().mapToInt(value -> value).toArray();
    }
}
