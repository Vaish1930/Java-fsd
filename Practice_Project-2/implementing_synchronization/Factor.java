
public class Factor {
    void printFactorial(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}

class TestThread extends Thread {
    Factor f;

    TestThread(Factor f) {
        this.f = f;
    }

    public void run() {
        f.printFactorial(36);
    }
}

class TestThread1 extends Thread {
    Factor f;

    TestThread1(Factor f) {
        this.f = f;
    }

    public void run() {
        f.printFactorial(15);
    }
}

class TestSynchronization1 {
    public static void main(String args[]) {
        Factor factorial = new Factor();
        TestThread t = new TestThread(factorial);
        TestThread1 t1 = new TestThread1(factorial);
        t.start();
        t1.start();
    }
}