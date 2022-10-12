package definingClasses.exercises.ex07Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;
    private List<Children> children;
    private List<Parents> parents;
    private List<Pokemon> pokemons;

    public Person(Company company, Car car, List<Children> children, List<Parents> parents, List<Pokemon> pokemons) {
        this.company = company;
        this.car = car;
        this.children = children;
        this.parents = parents;
        this.pokemons = pokemons;
    }

    public Person() {
        this.children = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Children> getChildren() {
        return children;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Company:").append("\n");
        if (company != null) {
            sb.append(company).append("\n");
        }
        sb.append("Car:").append("\n");
        if (car != null) {
            sb.append(car).append("\n");
        }
        sb.append("Pokemon:").append("\n");
        for (Pokemon pokemon : pokemons) {
            sb.append(pokemon).append("\n");
        }
        sb.append("Parents:").append("\n");
        for (Parents parent : parents) {
            sb.append(parent).append("\n");
        }
        sb.append("Children:").append("\n");
        for (Children child : children) {
            sb.append(child).append("\n");
        }
        return sb.toString();
    }
}
