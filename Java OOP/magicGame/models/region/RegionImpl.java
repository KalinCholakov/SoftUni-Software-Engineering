package magicGame.models.region;

import magicGame.models.magicians.Magician;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RegionImpl implements Region {
    private List<Magician> blackWidows;
    private List<Magician> wizards;

    public RegionImpl() {
        this.blackWidows = new ArrayList<>();
        this.wizards = new ArrayList<>();
    }

    @Override
    public String start(Collection<Magician> magicians) {
        blackWidows = magicians.stream()
                .filter(magician -> magician.getClass().getSimpleName().equals("BlackWidow"))
                .collect(Collectors.toList());

        wizards = magicians.stream()
                .filter(magician -> magician.getClass().getSimpleName().equals("Wizard"))
                .collect(Collectors.toList());

        while (blackWidows.stream().anyMatch(Magician::isAlive) &&
                wizards.stream().anyMatch(Magician::isAlive)) {

            for (Magician wizard : wizards) {
                for (Magician blackWidow : blackWidows) {
                    blackWidow.takeDamage(wizard.getMagic().fire());
                }
            }

            blackWidows = blackWidows.stream()
                    .filter(Magician::isAlive)
                    .collect(Collectors.toList());

            for (Magician blackWidow : blackWidows) {
                for (Magician wizard : wizards) {
                    wizard.takeDamage(blackWidow.getMagic().fire());
                }
            }

            wizards = wizards.stream()
                    .filter(Magician::isAlive)
                    .collect(Collectors.toList());
        }

        return wizards.stream().anyMatch(Magician::isAlive) ? "Wizards win!" : "Black widows win!";
    }
}
