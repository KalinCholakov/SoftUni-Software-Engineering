package interfacesAndAbstraction.exercises.ex07CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        AddCollection addCollection = new AddCollection();

        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();

        MyListImpl myList = new MyListImpl();

        String[] strings = scanner.nextLine().split( "\\s+" );
        int countRemoveOperation = Integer.parseInt( scanner.nextLine() );

        performAddOperation( strings, addCollection );
        performAddOperation( strings, addRemoveCollection );
        performAddOperation( strings, myList );

        performRemoveOperation( countRemoveOperation, addRemoveCollection );
        performRemoveOperation( countRemoveOperation, myList );
    }

    public static void performRemoveOperation(int counter, AddRemovable addRemovable) {
        for (int i = 0; i < counter; i++) {
            System.out.print( addRemovable.remove() + " " );
        }

        System.out.println();
    }

    public static void performAddOperation(String[] strings, Addable addable) {
        for (String string : strings) {
            System.out.println( addable.add( string + " " ) );
        }
    }
}
