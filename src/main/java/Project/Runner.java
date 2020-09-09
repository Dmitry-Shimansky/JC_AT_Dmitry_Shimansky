package main.java.Project;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Bottle bottle4 = new Bottle();
        bottle4.water.temperature = 5;
        bottle4.water.riseTemperature = 0.1;
        bottle4.open(1.5);

        Thread.sleep(5000);

        Bottle bottle5 = new Bottle();
        bottle5.water.temperature = 22;
        bottle5.water.riseTemperature = 0;
        bottle5.open(1.5);

        Thread.sleep(5000);

        Bottle bottle1 = new Bottle();
        bottle1.water.temperature = 0;
        bottle1.open(0.5);

        Thread.sleep(5000);

        Bottle bottle2 = new Bottle();
        bottle1.water.temperature = 0;
        bottle2.open(1);

        Thread.sleep(5000);

        Bottle bottle3 = new Bottle();
        bottle1.water.temperature = 0;
        bottle3.open(1.5);
    }

}
