package core;

import models.Doodle;

public interface DoodleSearch {
    void addDoodle(Doodle doodle);

    void removeDoodle(String doodleId);

    int size();

    boolean contains(Doodle doodle);

    Doodle getDoodle(String id);

    double getTotalRevenueFromDoodleAds();

    void visitDoodle(String title);

    Iterable<Doodle> searchDoodles(String searchQuery);

    Iterable<Doodle> getDoodleAds();

    Iterable<Doodle> getTop3DoodlesByRevenueThenByVisits();
}
