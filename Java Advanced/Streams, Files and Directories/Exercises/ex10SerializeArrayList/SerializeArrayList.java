package streamsFilesAndDirectories.exercises.ex10SerializeArrayList;

import java.io.Serializable;
import java.util.ArrayList;

public class SerializeArrayList implements Serializable {

    ArrayList<Double> ArrayList;

    @Override
    public String toString() {
        return ArrayList.stream().toString();
    }
}
