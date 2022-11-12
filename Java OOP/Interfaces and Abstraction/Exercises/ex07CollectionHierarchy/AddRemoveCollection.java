package interfacesAndAbstraction.exercises.ex07CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable {

    @Override
    public String remove() {
        return super.items.remove( items.size() - 1 );
    }

    @Override
    public int add(String item) {
        super.items.add( 0, item );
        return 0;
    }
}
