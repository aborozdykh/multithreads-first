/**
 * @author Andrii Borozdykh
 */
public class ThreadExample extends Thread {
    private Counter counter;

    public ThreadExample(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (!counter.isFinish()) {
            counter.incrementCounter();
            System.out.println(counter.getCounter());
        }
    }
}
