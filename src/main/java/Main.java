/**
 * @author Andrii Borozdykh
 */
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadExample threadExample = new ThreadExample(counter);
        threadExample.start();
        new Thread(new RunnableExample(counter)).start();
    }
}
