package interfacesAndAbstraction.exercises.ex06MilitaryElite.models;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.enums.Corps;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.Commando;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.Mission;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.utilities.Printer;

import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps, Set<Mission> missions) {
        super( id, firstName, lastName, salary, corps );
        this.missions = missions;
    }

    @Override
    public Set<Mission> getMission() {
        return missions;
    }

    @Override
    public String toString() {
        if (missions.size() < 1) {
            return String.format( "%s%nMissions:",
                    super.toString() );
        } else {
            return String.format( "%s%nMissions:%n%s",
                    super.toString(),
                    Printer.collectionToString( missions ) );
        }
    }
}
