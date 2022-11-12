package interfacesAndAbstraction.exercises.ex06MilitaryElite.enums;

public enum Corps {
    Airforces,
    Marines;

    public static boolean isValidCorp(String corp) {
        return !Corps.Airforces.name().equals( corp ) && !Corps.Marines.name().equals( corp );
    }
}
