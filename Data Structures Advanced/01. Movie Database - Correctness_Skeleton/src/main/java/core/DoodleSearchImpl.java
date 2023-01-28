package core;

import models.Doodle;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DoodleSearchImpl implements DoodleSearch {

    private final Map<String, Doodle> doodleMapById;
    private final Map<String, Doodle> doodleByTitle;

    public DoodleSearchImpl() {
        this.doodleMapById = new LinkedHashMap<>();
        this.doodleByTitle = new HashMap<>();
    }

    @Override
    public void addDoodle(Doodle doodle) {
        this.doodleMapById.put(doodle.getId(), doodle);
        this.doodleByTitle.put(doodle.getTitle(), doodle);
    }

    @Override
    public void removeDoodle(String doodleId) {
        Doodle doodleResult = this.doodleMapById.remove(doodleId);
        if (doodleResult == null) {
            throw new IllegalArgumentException();
        }
        doodleByTitle.remove(doodleResult.getTitle());
    }

    @Override
    public int size() {
        return this.doodleMapById.size();
    }

    @Override
    public boolean contains(Doodle doodle) {
        return this.doodleMapById.containsKey(doodle.getId());
    }

    @Override
    public Doodle getDoodle(String id) {
        Doodle doodleResult = this.doodleMapById.get(id);
        if (doodleResult == null) {
            throw new IllegalArgumentException();
        }
        return doodleResult;
    }

    @Override
    public double getTotalRevenueFromDoodleAds() {
        return this.doodleMapById.values().stream()
                .filter(Doodle::getIsAd)
                .mapToDouble(d -> d.getRevenue() * d.getVisits())
                .sum();
    }

    @Override
    public void visitDoodle(String title) {
        Doodle currentDoodles = doodleByTitle.get(title);
        if (currentDoodles == null) {
            throw new IllegalArgumentException();
        }
        int currentVisits = currentDoodles.getVisits();
        currentDoodles.setVisits(currentVisits + 1);

    }

    @Override
    public Iterable<Doodle> searchDoodles(String searchQuery) {
        return this.doodleMapById.values().stream().filter(d -> d.getTitle().contains(searchQuery))
                .sorted((l, r) -> {
                    if (l.getIsAd() && !r.getIsAd()) {
                        return -1;
                    }
                    if (!l.getIsAd() && r.getIsAd()) {
                        return 1;
                    }
                    String titleL = l.getTitle();
                    int lIndex = titleL.indexOf(searchQuery);
                    String titleR = r.getTitle();
                    int rIndex = titleR.indexOf(searchQuery);
                    if (lIndex > rIndex) {
                        return lIndex - rIndex;
                    }
                    if (rIndex > lIndex) {
                        return lIndex - rIndex;
                    }
                    return r.getVisits() - l.getVisits();
                }).collect(Collectors.toList());
    }

    @Override
    public Iterable<Doodle> getDoodleAds() {
        return this.doodleMapById.values().stream()
                .filter(Doodle::getIsAd).sorted((l, r) -> {
                    if (r.getRevenue() != l.getRevenue()) {
                        return Double.compare(r.getRevenue(), l.getRevenue());
                    }
                    return r.getVisits() - l.getVisits();
                }).collect(Collectors.toList());
    }

    @Override
    public Iterable<Doodle> getTop3DoodlesByRevenueThenByVisits() {
        return this.doodleMapById.values().stream()
                .sorted((l, r) -> {
                    if (r.getRevenue() != l.getRevenue()) {
                        return Double.compare(r.getRevenue(), l.getRevenue());
                    }
                    return r.getVisits() - l.getVisits();
                }).limit(3)
                .collect(Collectors.toList());
    }
}
