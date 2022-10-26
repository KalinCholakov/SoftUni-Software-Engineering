package workshopCustomDataStructures.exercises;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(3);
        linkedList.addFirst(17);
        linkedList.addFirst(49);
        linkedList.addLast(55);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList.removeLast());

        linkedList.forEach(System.out::println);

        int[] newArr = linkedList.toArray();

        for (int i : newArr) {
            System.out.print(i + " ");
        }

        LinkedListTail linkedListTail = new LinkedListTail();

        linkedListTail.addFirst(56);
        linkedListTail.addFirst(78);
        linkedListTail.addFirst(6);
        linkedListTail.addLast(5);
        linkedListTail.removeFirst();
        linkedListTail.removeLast();

        System.out.println(linkedListTail.removeLast());

    }
}
