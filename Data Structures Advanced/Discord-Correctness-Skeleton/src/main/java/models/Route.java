package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Route {
    private String id;

    private Double distance;

    private Integer popularity;

    private Boolean isFavorite;

    private List<String> locationPoints;

    public Route(String id, Double distance, Integer popularity, Boolean isFavorite, List<String> locationPoints) {
        this.id = id;
        this.distance = distance;
        this.popularity = popularity;
        this.isFavorite = isFavorite;
        this.locationPoints = locationPoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Boolean getIsFavorite() {
        return this.isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public List<String> getLocationPoints() {
        return locationPoints;
    }

    public void setLocationPoints(List<String> locationPoints) {
        this.locationPoints = locationPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(getDistance(), route.getDistance())
                && Objects.equals(getLocationPoints().get(0), route.getLocationPoints().get(0))
                && Objects.equals(getLocationPoints().get(getLocationPoints().size() - 1), route.getLocationPoints().get(route.getLocationPoints().size() - 1));
    }

    @Override
    public int hashCode() {
        if(getLocationPoints().size() == 0) {
            var a  =5;
        }
        return Objects.hash(getDistance(), getLocationPoints().get(0), getLocationPoints().get(getLocationPoints().size() - 1));
    }
}
