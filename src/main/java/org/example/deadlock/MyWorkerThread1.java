package org.example.deadlock;




public class MyWorkerThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("worker1 started");
        synchronized (TestThread.lock1) {


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
