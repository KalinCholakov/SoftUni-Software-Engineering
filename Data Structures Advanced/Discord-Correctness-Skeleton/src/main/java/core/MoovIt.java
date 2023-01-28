package core;

import models.Route;

public interface MoovIt {
    void addRoute(Route route);

    void removeRoute(String routeId);

    boolean contains(Route route);

    int size();

    Route getRoute(String routeId);

    void chooseRoute(String routeId);

    Iterable<Route> searchRoutes(String startPoint, String endPoint);

    Iterable<Route> getFavoriteRoutes(String destinationPoint);

    Iterable<Route> getTop5RoutesByPopularityThenByDistanceThenByCountOfLocationPoints();
}
