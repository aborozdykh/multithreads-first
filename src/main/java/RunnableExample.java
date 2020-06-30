/**
 * @author Andrii Borozdykh
 */
public class RunnableExample implements Runnable {
    private Counter counter;

    public RunnableExample(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (!counter.isFinish()) {
            counter.incrementCounter();
            System.out.println(counter.getCounter());
        }
    }
}
