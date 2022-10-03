package streamsFilesAndDirectories.lab.ex09SerializeCustomObject;

import java.io.Serializable;

public class Cube implements Serializable {

    String color;
    Double width;
    Double height;
    Double depth;

    @Override
    public String toString() {
        return "The cube has color " + color + ", width " + width + ", height " + height + " and depth " + depth;
    }
}
