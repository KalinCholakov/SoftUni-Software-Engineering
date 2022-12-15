package christmasPastryShop.repositories;

import christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import christmasPastryShop.repositories.interfaces.CocktailRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CocktailRepositoryImpl implements CocktailRepository<Cocktail> {
    private Map<String, Cocktail> cocktailMap;

    public CocktailRepositoryImpl() {
        this.cocktailMap = new HashMap<>();
    }

    @Override
    public Cocktail getByName(String name) {
        return cocktailMap.get(name);
    }

    @Override
    public Collection<Cocktail> getAll() {
        return Collections.unmodifiableCollection(cocktailMap.values());
    }

    @Override
    public void add(Cocktail cocktail) {
        this.cocktailMap.put(cocktail.getName(), cocktail);
    }
}
