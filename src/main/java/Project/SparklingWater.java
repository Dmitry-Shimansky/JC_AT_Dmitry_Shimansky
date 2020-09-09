package main.java.Project;

public class SparklingWater extends Water {

    public boolean isOpened = false;
    public boolean hasBubble = true;
    public int temperature;
    double riseTemperature = 0;

    public void pump(Bubble[] bubbles) {

    }

    public void checkIsOpened(double volume) {
        Thread thread = new Thread(() -> {
            while (!isOpened) {
                System.out.println("Bottle is closed...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            degas(volume);
        });
        thread.start();
    }

    private void degas(double volume) {

        if (temperature == 0) {
            for (int i = 0; i < volume * 1000; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(i + 1);
                new Bubble("CO2").cramp();
            }
        } else {
            int bubbleSpeed = 10 + temperature * 5;
            double bubbleCount = volume * 1000;
            double bubbleSpent = 0;
            int spentTime = 0;

            while (bubbleSpent <= bubbleCount) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bubbleSpent += bubbleSpeed + (riseTemperature % 60 * 5);
                spentTime++;


                System.out.println("Пузырьков вышло: " + bubbleSpent);
                System.out.println("Пузырьков осталось: " + (bubbleCount - bubbleSpent));
                System.out.println("Время: " + spentTime + " сек");
            }
        }
        System.out.println("");
        System.out.println("No more bubbles in the water !");
    }
}
