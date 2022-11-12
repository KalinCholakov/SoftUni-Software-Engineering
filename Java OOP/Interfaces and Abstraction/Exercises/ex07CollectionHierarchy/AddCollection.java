package interfacesAndAbstraction.exercises.ex07CollectionHierarchy;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String item) {
        super.items.add( item );
        return items.size() - 1;
    }
}
