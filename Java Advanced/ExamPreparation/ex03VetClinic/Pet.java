package examPreparation.ex03VetClinic;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
        setName(name);
        setAge(age);
        setOwner(owner);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("%s %d (%s)", getName(), getAge(), getOwner());
    }
}
