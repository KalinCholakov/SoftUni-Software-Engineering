package examPreparation.ex03VetClinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clinic {
    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
//        return data.stream()
//                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
//                .findAny()
//                .orElse(null);
    }

    public Pet getOldestPet() {
        return Collections.max(data, Comparator.comparingInt(Pet::getAge));
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder("The clinic has the following patients:");

        for (Pet pet : data) {
            stringBuilder.append(System.lineSeparator())
                    .append(pet.getName())
                    .append(" ")
                    .append(pet.getOwner());
        }

        return stringBuilder.toString();
    }
}
