package iteratorsAndComparators.exercises.ex06StrategyPattern;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return Integer.compare(first.getAge(), second.getAge());
    }
}
