package org.example.deadlock;

public class TestThread {
    public  static  Object lock1=new Object();
 public static    Object lock2=new Object();
    public static void main(String[] args) {
        MyWorkerThread1 myWorkerThread1=new MyWorkerThread1();
        MyWorkerThread2 myWorkerThread2=new MyWorkerThread2();
        myWorkerThread1.worker1();
        myWorkerThread2.worker2();
        myWorkerThread1.start();
        myWorkerThread2.start();
//        DeadLock1 deadLock1=new DeadLock1();
//        deadLock1.deadLock1();
    }
}
