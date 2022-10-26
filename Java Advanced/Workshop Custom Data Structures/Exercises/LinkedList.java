package workshopCustomDataStructures.exercises;

import java.util.function.Consumer;

public class LinkedList {

    private static class Node {
        private final int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private int size;

    public void addFirst(int element) {

        Node newNode = new Node(element);

        if (!isEmpty()) {
            newNode.next = head;
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

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(element);
        size++;
    }

    public int get(int index) {
        ensureIndex(index);

        int currentIndex = 0;
        Node currentNode = head;

        while (currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
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
        head = head.next;
        size--;

        return removedElement;
    }

    public int removeLast() {
        if (size < 2) {
            return removeFirst();
        }

        Node currentNode = head;

        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        int removedElement = currentNode.next.value;
        currentNode.next = null;
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

        int[] arr = new int[size];

        int counter = 0;

        Node currentNode = head;

        while (currentNode != null) {
            arr[counter] = currentNode.value;
            counter++;
            currentNode = currentNode.next;
        }

        return arr;
    }
}
