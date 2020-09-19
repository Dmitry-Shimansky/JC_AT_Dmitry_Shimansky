package main.java.Project.Vessel;

import main.java.Project.Material.Material;
import main.java.Project.Staff.Transformable;

public class Can extends Vessel implements Containable {
    public Can(double volume, int temperature, double riseTemperature, double volume1, double diameter, int weight, Material material) {
        super(volume, temperature, riseTemperature, volume1, diameter, weight, material);
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
