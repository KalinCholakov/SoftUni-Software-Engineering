package magicGame.core;

import magicGame.models.magicians.BlackWidow;
import magicGame.models.magicians.Magician;
import magicGame.models.magicians.Wizard;
import magicGame.models.magics.BlackMagic;
import magicGame.models.magics.Magic;
import magicGame.models.magics.RedMagic;
import magicGame.models.region.Region;
import magicGame.models.region.RegionImpl;
import magicGame.repositories.MagicRepositoryImpl;
import magicGame.repositories.MagicianRepositoryImpl;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import static magicGame.common.ExceptionMessages.*;
import static magicGame.common.OutputMessages.SUCCESSFULLY_ADDED_MAGIC;
import static magicGame.common.OutputMessages.SUCCESSFULLY_ADDED_MAGICIAN;

public class ControllerImpl implements Controller {
    private MagicRepositoryImpl magics;
    private MagicianRepositoryImpl magicians;
    private Region region;

    public ControllerImpl() {
        this.magics = new MagicRepositoryImpl();
        this.magicians = new MagicianRepositoryImpl();
        this.region = new RegionImpl();
    }

    @Override
    public String addMagic(String type, String name, int bulletsCount) {
        Magic magic;

        if (type.equals("RedMagic")) {
            magic = new RedMagic(name, bulletsCount);
        } else if (type.equals("BlackMagic")) {
            magic = new BlackMagic(name, bulletsCount);
        } else {
            throw new IllegalArgumentException(INVALID_MAGIC_TYPE);
        }

        this.magics.addMagic(magic);

        return String.format(SUCCESSFULLY_ADDED_MAGIC, name);
    }

    @Override
    public String addMagician(String type, String username, int health, int protection, String magicName) {
        Magic magic = magics.findByName(magicName);

        if (magic == null) {
            throw new NullPointerException(MAGIC_CANNOT_BE_FOUND);
        }

        Magician magician;

        if (type.equals("Wizard")) {
            magician = new Wizard(username, health, protection, magic);
        } else if (type.equals("BlackWidow")) {
            magician = new BlackWidow(username, health, protection, magic);
        } else {
            throw new IllegalArgumentException(INVALID_MAGICIAN_TYPE);
        }

        this.magicians.addMagician(magician);

        return String.format(SUCCESSFULLY_ADDED_MAGICIAN, username);
    }

    @Override
    public String startGame() {
        Collection<Magician> magicianCollection = this.magicians
                .getData()
                .stream()
                .filter(Magician::isAlive)
                .collect(Collectors.toList());

        return this.region.start(magicianCollection);
    }

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();

        this.magicians
                .getData()
                .stream()
                .sorted(Comparator.comparing((Magician m) -> m.getClass().getSimpleName())
                        .thenComparingInt(Magician::getHealth)
                        .thenComparing(Magician::getUsername))
                .forEach(magician -> sb
                        .append(magician)
                        .append(System.lineSeparator()));

        /*this.magicians
                .getData()
                .stream()
                .sorted((m1, m2) -> {
                    int result = m1.getClass().getSimpleName().compareTo(m2.getClass().getSimpleName());

                    if (result == 0) {
                        result = Integer.compare(m2.getHealth(), m1.getHealth());
                    }

                    if (result == 0) {
                        result = m1.getUsername().compareTo(m2.getUsername());
                    }

                    return result;
                })
                .forEach(magician -> sb
                        .append(magician)
                        .append(System.lineSeparator()));*/

        /*List<Magician> wizards = this.magicians.getData().stream()
                .filter(magician -> magician.getClass().getSimpleName().equals("Wizard"))
                .collect(Collectors.toCollection(ArrayList::new));

        List<Magician> blackWidows = this.magicians.getData().stream()
                .filter(magician -> magician.getClass().getSimpleName().equals("BlackWidow"))
                .collect(Collectors.toCollection(ArrayList::new));

        wizards = wizards.stream()
                .sorted(Comparator
                        .comparing(Magician::getHealth)
                        .reversed()
                        .thenComparing(Magician::getUsername))
                .collect(Collectors.toCollection(ArrayList::new));

        blackWidows = blackWidows.stream()
                .sorted(Comparator
                        .comparing(Magician::getHealth)
                        .reversed()
                        .thenComparing(Magician::getUsername))
                .collect(Collectors.toCollection(ArrayList::new));



        for (Magician wizard : wizards) {
            sb.append(wizard).append(System.lineSeparator());
        }

        for (Magician blackWidow : blackWidows) {
            sb.append(blackWidow).append(System.lineSeparator());
        }*/

        return sb.toString().trim();
    }
}
