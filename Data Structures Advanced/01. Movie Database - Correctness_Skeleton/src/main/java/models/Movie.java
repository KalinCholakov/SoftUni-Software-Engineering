package models;

import java.util.List;

public class Movie {
    private String id;

    private String name;

    private int releaseYear;

    private double rating;

    private List<String> actors;

    public Movie(String id, String name, int releaseYear, double rating, List<String> actors) {
        this.id = id;
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.actors = actors;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getActors() {
        return this.actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}
