package main.java.Project;

import main.java.Project.Vessel.Bottle;

public class Runner {
    public static void main(String[] args) {

        Bottle bottle1 = new Bottle(1.5,5,0.1);
        System.out.println("Open bottle1");

        Bottle bottle2 = new Bottle(1.5,22,0);
        System.out.println("Open bottle2");

//        Thread.sleep(5000);
    }
}
