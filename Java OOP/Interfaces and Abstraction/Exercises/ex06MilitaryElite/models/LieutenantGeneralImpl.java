package interfacesAndAbstraction.exercises.ex06MilitaryElite.models;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.LieutenantGeneral;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.Private;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.utilities.Printer;

import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements Private, LieutenantGeneral {
    private Set<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, Set<Private> privates) {
        super( id, firstName, lastName, salary );
        this.privates = privates;
    }

    @Override
    public Set<Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        if (privates.size() < 1) {
            return String.format( "%s%nPrivates:",
                    super.toString() );
        } else {
            return String.format( "%s%nPrivates:%n%s",
                    super.toString(),
                    Printer.collectionToString( privates ) );
        }
    }
}
