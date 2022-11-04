package inheritance.lab.ex05RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add(13);
        randomArrayList.add(546);
        randomArrayList.add(54);
        randomArrayList.add(5);

        System.out.println(randomArrayList.getRandomElement());
    }
}
