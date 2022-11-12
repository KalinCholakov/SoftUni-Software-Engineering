package interfacesAndAbstraction.exercises.ex06MilitaryElite.models;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.enums.Corps;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.Engineer;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.Repair;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.utilities.Printer;

import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps, Set<Repair> repairs) {
        super( id, firstName, lastName, salary, corps );
        this.repairs = repairs;
    }

    @Override
    public Set<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        if (repairs.size() < 1) {
            return String.format( "%s%nRepairs:",
                    super.toString() );
        } else {
            return String.format( "%s%nRepairs:%n%s",
                    super.toString(),
                    Printer.collectionToString( repairs ) );
        }
    }
}
