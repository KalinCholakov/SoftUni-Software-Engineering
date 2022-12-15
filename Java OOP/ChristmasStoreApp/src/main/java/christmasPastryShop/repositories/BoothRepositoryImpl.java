package christmasPastryShop.repositories;

import christmasPastryShop.entities.booths.interfaces.Booth;
import christmasPastryShop.repositories.interfaces.BoothRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BoothRepositoryImpl implements BoothRepository<Booth> {
    private Map<Integer, Booth> boothMap;

    public BoothRepositoryImpl() {
        this.boothMap = new HashMap<>();
    }

    @Override
    public Booth getByNumber(int number) {
        return boothMap.get(number);
    }

    @Override
    public Collection<Booth> getAll() {
        return Collections.unmodifiableCollection(boothMap.values());
    }

    @Override
    public void add(Booth booth) {
        this.boothMap.put(booth.getBoothNumber(), booth);
    }
}