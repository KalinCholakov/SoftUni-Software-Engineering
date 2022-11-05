package inheritance.exercises.ex06Animals;

public class Cat extends Animal {

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return "Meow meow!";
    }
}
