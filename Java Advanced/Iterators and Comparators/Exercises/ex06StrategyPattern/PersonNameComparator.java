package iteratorsAndComparators.exercises.ex06StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        if (first.getName().length() == (second.getName().length())) {
            char letterOfFirstPerson = first.getName().toLowerCase().charAt(0);
            char letterOfSecondPerson = second.getName().toLowerCase().charAt(0);
            return Character.compare(letterOfFirstPerson, letterOfSecondPerson);
        }
        return Integer.compare(first.getName().length(), (second.getName().length()));
    }
}
