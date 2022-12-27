package magicGame.repositories;

import magicGame.models.magics.Magic;
import magicGame.repositories.interfaces.MagicRepository;

import java.util.ArrayList;
import java.util.Collection;

import static magicGame.common.ExceptionMessages.INVALID_MAGIC_REPOSITORY;

public class MagicRepositoryImpl implements MagicRepository<Magic> {
    private Collection<Magic> magics;

    public MagicRepositoryImpl() {
        this.magics = new ArrayList<>();
    }

    @Override
    public Collection<Magic> getData() {
        return magics;
    }

    @Override
    public void addMagic(Magic magic) {
        if (magic == null) {
            throw new NullPointerException(INVALID_MAGIC_REPOSITORY);
        }
        magics.add(magic);
    }

    @Override
    public boolean removeMagic(Magic magic) {
        return magics.remove(magic);
    }

    @Override
    public Magic findByName(String name) {
        return magics.stream()
                .filter(magic -> magic.getName().equals(name))
                .findFirst().orElse(null);
    }

}
