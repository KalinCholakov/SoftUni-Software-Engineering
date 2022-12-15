package christmasPastryShop.repositories;

import christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import christmasPastryShop.repositories.interfaces.DelicacyRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DelicacyRepositoryImpl implements DelicacyRepository<Delicacy> {
    private Map<String, Delicacy> delicacyMap;

    public DelicacyRepositoryImpl() {
        this.delicacyMap = new HashMap<>();
    }

    @Override
    public Delicacy getByName(String name) {
        return delicacyMap.get(name);
    }

    @Override
    public Collection<Delicacy> getAll() {
        return Collections.unmodifiableCollection(delicacyMap.values());
    }

    @Override
    public void add(Delicacy delicacy) {
        this.delicacyMap.put(delicacy.getName(), delicacy);
    }
}
