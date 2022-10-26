package workshopCustomDataStructures;

public class Main {
    public static void main(String[] args) {

        SmartArray<Integer> smartArray = new SmartArray<>();

        for (int i = 0; i < 4; i++) {
            smartArray.add(i + 1);
        }

        int getElement = smartArray.get(1);
        int removedElement = smartArray.remove(1);
        System.out.println(smartArray.contains(2));
        smartArray.add(1, 2);

        smartArray.forEach(System.out::println);
        System.out.println("===========");
        System.out.println(getElement);
        System.out.println("===========");
        System.out.println(removedElement);

        CustomStack<Integer> customStack = new CustomStack<>();

        customStack.push(13);
        customStack.push(69);
        customStack.push(129);
        customStack.pop();

        System.out.println(customStack.peek());
        customStack.forEach(System.out::println);
    }
}
