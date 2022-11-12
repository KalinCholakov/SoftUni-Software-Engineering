package interfacesAndAbstraction.exercises.ex06MilitaryElite.utilities;

public class Printer {
    public static String collectionToString(Iterable iterable) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : iterable) {
            stringBuilder.append( "  " ).append( object ).append( "\n" );
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.replace( stringBuilder.length() - 1, stringBuilder.length(), "" );
        }
        return stringBuilder.toString();
    }
}
