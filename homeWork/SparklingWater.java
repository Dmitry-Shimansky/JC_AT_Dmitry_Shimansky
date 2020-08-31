package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparklingWater extends Water {

    public boolean bottleClose = true;
    public boolean hasBubble = true;
    public List<Bubble> bubbles = new ArrayList<>();

    public void pump (Bubble[] bubbles) {
        this.bubbles = Arrays.asList(bubbles);
    }

    public void isOpened() throws InterruptedException {
        Thread.sleep(2000);
        if (!bottleClose) {
            degas();
        }
    }

    public void degas(){
        for (Bubble i: bubbles) {
            i.cramp();
        }
    }
}
