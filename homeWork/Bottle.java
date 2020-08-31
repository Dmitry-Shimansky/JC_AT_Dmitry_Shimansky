package homeWork;

public class Bottle {
    public double volume;
    public SparklingWater water = new SparklingWater();

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
    }

    public void open() throws InterruptedException {
        water.isOpened();
    }
}
