package core;

import models.Route;

import java.util.*;
import java.util.stream.Collectors;

public class MoovItImpl implements MoovIt {
    private final Map<String, Route> routeMap;

    private final Set<Route> routes;

    public MoovItImpl() {
        this.routeMap = new LinkedHashMap<>();
        this.routes = new HashSet<>();
    }

    @Override
    public void addRoute(Route route) {
        if (this.routes.contains(route)) {
            throw new IllegalArgumentException();
        }
        this.routeMap.put(route.getId(), route);
        this.routes.add(route);
    }

    @Override
    public void removeRoute(String routeId) {
        Route result = this.routeMap.remove(routeId);
        if (result == null) {
            throw new IllegalArgumentException();
        }
        this.routes.remove(result);
    }

    @Override
    public boolean contains(Route route) {
        return this.routes.contains(route);
    }

    @Override
    public int size() {
        return this.routeMap.size();
    }

    @Override
    public Route getRoute(String routeId) {
        Route result = this.routeMap.get(routeId);
        if (result == null) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    @Override
    public void chooseRoute(String routeId) {
        Route currentRoute = this.routeMap.get(routeId);
        if (currentRoute == null) {
            throw new IllegalArgumentException();
        }
        Integer currentPop = currentRoute.getPopularity();
        currentRoute.setPopularity(currentPop + 1);
    }

    @Override
    public Iterable<Route> searchRoutes(String startPoint, String endPoint) {
        return this.routeMap.values().stream()
                .filter(r -> {
                    List<String> locationPoints = r.getLocationPoints();
                    int startIndex = locationPoints.indexOf(startPoint);
                    int endIndex = locationPoints.indexOf(endPoint);
                    return startIndex > -1 && endIndex > -1 && startIndex < endIndex;
                }).sorted((l, r) -> {
                    if (l.getIsFavorite() && !r.getIsFavorite()) {
                        return -1;
                    }
                    if (r.getIsFavorite() && !l.getIsFavorite()) {
                        return 1;
                    }
                    int lDistance = l.getLocationPoints().indexOf(endPoint) - l.getLocationPoints().indexOf(startPoint);
                    int rDistance = r.getLocationPoints().indexOf(endPoint) - r.getLocationPoints().indexOf(startPoint);

                    if (lDistance != rDistance) {
                        return lDistance - rDistance;
                    }
                    return r.getPopularity() - l.getPopularity();
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Route> getFavoriteRoutes(String destinationPoint) {
        return this.routeMap.values().stream()
                .filter(r -> {
                    int index = r.getLocationPoints().indexOf(destinationPoint);
                    return r.getIsFavorite() && index > 0;
                })
                .sorted((l, r) -> {
                    if (!l.getDistance().equals(r.getDistance())) {
                        return Double.compare(l.getDistance(), r.getDistance());
                    }
                    return r.getPopularity() - l.getPopularity();
                }).collect(Collectors.toList());
    }

    @Override
    public Iterable<Route> getTop5RoutesByPopularityThenByDistanceThenByCountOfLocationPoints() {
        return this.routeMap.values().stream()
                .sorted((l, r) -> {
                    if (!l.getPopularity().equals(r.getPopularity())) {
                        return r.getPopularity() - l.getPopularity();
                    }
                    if (!l.getDistance().equals(r.getDistance())) {
                        return Double.compare(l.getDistance(), r.getDistance());
                    }
                    return l.getLocationPoints().size() - r.getLocationPoints().size();
                })
                .limit(5)
                .collect(Collectors.toList());
    }
}
