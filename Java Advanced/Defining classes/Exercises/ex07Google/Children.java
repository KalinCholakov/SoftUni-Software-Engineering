package definingClasses.exercises.ex07Google;

public class Children {
    private String name;
    private String birthday;

    public Children(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, birthday);
    }
}
