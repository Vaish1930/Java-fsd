class DemoThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        DemoThread demoThread = new DemoThread();
        demoThread.start();
    }
}