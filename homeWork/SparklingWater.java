package homeWork;

public class SparklingWater extends Water {

    public boolean bottleClose = true;
    public boolean hasBubble = true;

    public void pump (Bubble[] bubbles) {

    }

    public void isOpened(double volume) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (bottleClose) {
            degas(volume);
        }
    }

    public void degas(double volume) {
            for (int i = 0; i < volume*1000; i++) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(i+1);
                new Bubble().cramp();
            }
            System.out.println(" ");
            System.out.println("No more bubbles in the water !");
    }
}
