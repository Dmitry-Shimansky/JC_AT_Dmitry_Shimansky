package homeWork;

public class Bottle {

    private double volume;
    public SparklingWater water = new SparklingWater();

    public void open(double volume) {
        if (water.hasBubble) {
            water.hasBubble = false;
            water.isOpened(volume);
        } else {
            water.hasBubble = true;
        }
    }
}
