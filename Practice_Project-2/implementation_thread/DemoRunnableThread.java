
public class DemoRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        DemoRunnableThread demoRunnableThread = new DemoRunnableThread();
        Thread thread = new Thread(demoRunnableThread);
        thread.start();

    }

}
