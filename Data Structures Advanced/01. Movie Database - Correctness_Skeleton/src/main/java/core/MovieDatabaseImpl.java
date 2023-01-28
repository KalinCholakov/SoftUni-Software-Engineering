package core;

import models.Movie;

import java.util.*;
import java.util.stream.Collectors;

public class MovieDatabaseImpl implements MovieDatabase {

    private final Map<String, Movie> movieMapById;
    private final Map<String, Integer> actorsCount;

    public MovieDatabaseImpl() {
        this.movieMapById = new LinkedHashMap<>();
        this.actorsCount = new HashMap<>();
    }

    @Override
    public void addMovie(Movie movie) {
        this.movieMapById.put(movie.getId(), movie);

        for (int i = 0; i < movie.getActors().size(); i++) {
            String currentActor = movie.getActors().get(i);
            if (!actorsCount.containsKey(currentActor)) {
                actorsCount.put(currentActor, 1);
            } else {
                Integer current = actorsCount.get(currentActor);
                actorsCount.put(currentActor, current + 1);
            }
        }
    }

    @Override
    public void removeMovie(String movieId) {
        Movie result = this.movieMapById.remove(movieId);
        if (result == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < result.getActors().size(); i++) {
            String currentActor = result.getActors().get(i);
            if (actorsCount.get(currentActor) > 1) {
                Integer current = actorsCount.get(currentActor);
                actorsCount.put(currentActor, current - 1);
            } else {
                actorsCount.remove(currentActor);
            }
        }
    }

    @Override
    public int size() {
        return this.movieMapById.size();
    }

    @Override
    public boolean contains(Movie movie) {
        return this.movieMapById.containsKey(movie.getId());
    }

    @Override
    public Iterable<Movie> getMoviesByActor(String actorName) {
        List<Movie> resultList = this.movieMapById.values().stream()
                .filter(m -> m.getActors().contains(actorName))
                .sorted((l, r) -> {
                    if (r.getRating() != l.getRating()) {
                        return Double.compare(r.getRating(), l.getRating());
                    }
                    return r.getReleaseYear() - l.getReleaseYear();
                }).collect(Collectors.toList());
        if (resultList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return resultList;
    }

    @Override
    public Iterable<Movie> getMoviesByActors(List<String> actors) {
        List<Movie> resultList = this.movieMapById.values().stream()
                .filter(m -> new HashSet<>(m.getActors()).containsAll(actors))
                .sorted((l, r) -> {
                    if (r.getRating() != l.getRating()) {
                        return Double.compare(r.getRating(), l.getRating());
                    }
                    return r.getReleaseYear() - l.getReleaseYear();
                }).collect(Collectors.toList());
        if (resultList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return resultList;
    }

    @Override
    public Iterable<Movie> getMoviesByYear(Integer releaseYear) {
        return this.movieMapById.values().stream()
                .filter(m -> m.getReleaseYear() == releaseYear)
                .sorted((l, r) -> Double.compare(r.getRating(), l.getRating())
                ).collect(Collectors.toList());
    }

    @Override
    public Iterable<Movie> getMoviesInRatingRange(double lowerBound, double upperBound) {
        return this.movieMapById.values().stream()
                .filter(m -> lowerBound <= m.getRating() && m.getRating() <= upperBound)
                .sorted((l, r) -> Double.compare(r.getRating(), l.getRating()))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Movie> getAllMoviesOrderedByActorPopularityThenByRatingThenByYear() {
        return this.movieMapById.values().stream()
                .sorted((l, r) -> {
                    int lCount = 0;
                    for (int i = 0; i < l.getActors().size(); i++) {
                        lCount = actorsCount.get(l.getActors().get(i));
                    }
                    int rCount = 0;
                    for (int i = 0; i < r.getActors().size(); i++) {
                        rCount = actorsCount.get(r.getActors().get(i));
                    }
                    if (lCount != rCount) {
                        return rCount - lCount;
                    }
                    if (l.getRating() != r.getRating()) {
                        return Double.compare(r.getRating(), l.getRating());
                    }
                    return r.getReleaseYear() - l.getReleaseYear();

                }).collect(Collectors.toList());
    }
}
