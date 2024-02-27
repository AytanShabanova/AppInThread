package org.example.deadlock;



public class MyWorkerThread2 extends Thread {
    public static void worker2() {

        System.out.println("worker2 started");
        synchronized (TestThread.lock2) {
            System.out.println("worker2 run");

            // Bekleme yaratmak için lock1'i almak yerine lock2'yi tekrar alalım
            synchronized (TestThread.lock1) {
                System.out.println("worker2 run 2");
            }
        }
        System.out.println("worker2 finished");
    }
}