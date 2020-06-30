/**
 * @author Andrii Borozdykh
 */
public class Counter {
    private static final int FINISH = 100;
    private int counter;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isFinish() {
        return counter == FINISH;
    }
}
