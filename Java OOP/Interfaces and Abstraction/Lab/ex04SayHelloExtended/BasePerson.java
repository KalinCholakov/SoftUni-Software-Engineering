package interfacesAndAbstraction.lab.ex04SayHelloExtended;

public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
