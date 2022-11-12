package interfacesAndAbstraction.exercises.ex06MilitaryElite.models;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super( id, firstName, lastName );
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Code Number: " + this.getCodeNumber();
    }
}
