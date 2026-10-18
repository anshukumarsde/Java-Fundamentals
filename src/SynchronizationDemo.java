public final class SynchronizationDemo {
    private SynchronizationDemo() {
    }

    public static void run() throws InterruptedException {
        int incrementsPerWorker = 10_000;
        Counter counter = new Counter();
        Thread firstWorker = new Thread(() -> increment(counter, incrementsPerWorker));
        Thread secondWorker = new Thread(() -> increment(counter, incrementsPerWorker));

        firstWorker.start();
        secondWorker.start();
        firstWorker.join();
        secondWorker.join();

        System.out.println("Two threads each incremented a shared counter "
                + incrementsPerWorker + " times.");
        System.out.println("Final count: " + counter.value());
        System.out.println("The synchronized increment method protects each update.");
    }

    private static void increment(Counter counter, int times) {
        for (int i = 0; i < times; i++) {
            counter.increment();
        }
    }

    private static final class Counter {
        private int count;

        private synchronized void increment() {
            count++;
        }

        private synchronized int value() {
            return count;
        }
    }
}
