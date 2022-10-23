package exam20221022.ex03AnimalShelter.shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Animal animal) {
        if (data.size() < capacity) {
            data.add(animal);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(animal -> animal.getName().equals(name));
    }

    public Animal getAnimal(String name, String caretaker) {
        return data.stream()
                .filter(animal -> animal.getName().equals(name) && animal.getCaretaker().equals(caretaker))
                .findAny()
                .orElse(null);
    }

    public Animal getOldestAnimal() {
        return Collections.max(data, Comparator.comparingInt(Animal::getAge));
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder("The shelter has the following animals:");

        for (Animal animal : data) {
            sb.append(System.lineSeparator())
                    .append(animal.getName())
                    .append(" ")
                    .append(animal.getCaretaker());
        }

        return sb.toString();
    }
}
