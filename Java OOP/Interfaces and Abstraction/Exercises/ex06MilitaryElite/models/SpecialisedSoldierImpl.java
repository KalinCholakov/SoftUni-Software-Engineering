package interfacesAndAbstraction.exercises.ex06MilitaryElite.models;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.enums.Corps;

public class SpecialisedSoldierImpl extends PrivateImpl {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super( id, firstName, lastName, salary );
        this.corps = corps;
    }

    public Corps getCorps() {
        return corps;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Corps: " + getCorps().name();
    }
}
