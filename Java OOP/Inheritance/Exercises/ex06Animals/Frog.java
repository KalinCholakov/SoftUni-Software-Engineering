package inheritance.exercises.ex06Animals;

public class Frog extends Animal {

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return "Ribbit";
    }
}
