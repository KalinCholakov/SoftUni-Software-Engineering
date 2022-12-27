package magicGame.repositories;

import magicGame.models.magicians.Magician;
import magicGame.repositories.interfaces.MagicianRepository;

import java.util.ArrayList;
import java.util.Collection;

import static magicGame.common.ExceptionMessages.INVALID_MAGICIAN_REPOSITORY;

public class MagicianRepositoryImpl implements MagicianRepository<Magician> {
    private Collection<Magician> magicians;

    public MagicianRepositoryImpl() {
        this.magicians = new ArrayList<>();
    }

    @Override
    public Collection<Magician> getData() {
        return magicians;
    }

    @Override
    public void addMagician(Magician magician) {
        if (magician == null) {
            throw new NullPointerException(INVALID_MAGICIAN_REPOSITORY);
        }
        magicians.add(magician);
    }

    @Override
    public boolean removeMagician(Magician magician) {
        return magicians.remove(magician);
    }

    @Override
    public Magician findByUsername(String name) {
        return magicians.stream()
                .filter(magician -> magician.getUsername().equals(name))
                .findFirst().orElse(null);
    }
}
