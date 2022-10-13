package definingClasses.exercises.ex08FamilyTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private final String name;
    private final String birthday;
    private final List<Person> parents = new ArrayList<>();
    private final List<Person> children = new ArrayList<>();

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void addChild(Person child) {
        children.add(child);
        child.parents.add(this);
    }

    public List<Person> getParents() {
        return Collections.unmodifiableList(parents);
    }

    public List<Person> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString() {
        return name + " " + birthday;
    }
}
