package main.java.Project.Vessel;

import main.java.Project.Staff.Transformable;

public interface Containable {

    void addStuff(Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();

    int getFreeSpace();

    void open();

    void close();
}
