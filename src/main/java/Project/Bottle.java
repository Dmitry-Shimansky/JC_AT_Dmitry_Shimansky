package main.java.Project;

public class Bottle {

    private double volume;

    public SparklingWater water = new SparklingWater();

    public void open(double volume) {
        if (water.hasBubble) {
            water.hasBubble = false;
            water.checkIsOpened(volume);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            water.isOpened = true;
        } else {
            water.hasBubble = true;
            water.isOpened = false;
        }
    }
}
