package main.java.project.vessel;

public class Warehouse {

    public static void main(String[] args) {
        Warehouse ctr = new Warehouse();
        System.out.println(ctr.bottle.toString());
        System.out.println(ctr.cup.toString());
    }

    private VesselBox<Bottle> bottle;
    private VesselBox<Cup> cup;

    public Warehouse() {
        this.bottle = new VesselBox<Bottle>(new Bottle[9]);
        this.cup = new VesselBox<Cup>(new Cup[9]);
    }
}
