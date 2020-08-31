package homeWork;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Bubble[] bubbles = new Bubble[10000];

        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble();
        }

        SparklingWater water = new SparklingWater();
        water.pump(bubbles);
        Bottle oneBottle = new Bottle(1, water);
        oneBottle.open();
    }

}
