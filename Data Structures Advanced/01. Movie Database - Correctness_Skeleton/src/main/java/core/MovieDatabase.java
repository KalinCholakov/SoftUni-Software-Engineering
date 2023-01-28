package core;

import models.Movie;

import java.util.List;

public interface MovieDatabase {
    void addMovie(Movie movie);

    void removeMovie(String movieId);

    int size();

    boolean contains(Movie movie);

    Iterable<Movie> getMoviesByActor(String actorName);

    Iterable<Movie> getMoviesByActors(List<String> actors);

    Iterable<Movie> getMoviesByYear(Integer releaseYear);

    Iterable<Movie> getMoviesInRatingRange(double lowerBound, double upperBound);

    Iterable<Movie> getAllMoviesOrderedByActorPopularityThenByRatingThenByYear();
}
