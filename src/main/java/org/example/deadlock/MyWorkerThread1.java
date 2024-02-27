package org.example.deadlock;




public class MyWorkerThread1 extends Thread {
    public static void worker1() {

        System.out.println("worker1 started");
        synchronized (TestThread.lock1) {
            MyWorkerThread2.worker2();

            System.out.println("worker1 run");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (TestThread.lock2) {
                System.out.println("worker1 run 2");
            }
        }
        System.out.println("worker1 finished");
    }
}
