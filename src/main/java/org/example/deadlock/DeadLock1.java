package org.example.deadlock;

public class DeadLock1 {
    Object lock1 = new Object();
    Object lock2 = new Object();

   public void deadLock1(){
       Thread thread1 = new Thread(() -> {
           synchronized (lock1) {
               System.out.println("Thread 1: Holding lock 1");
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

               synchronized (lock2) {
                   System.out.println("Thread 1: Holding lock 1 and lock 2");
               }
           }
       });

       Thread thread2 = new Thread(() -> {
           synchronized (lock2) {
               System.out.println("Thread 2: Holding lock 2");
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

               synchronized (lock1) {
                   System.out.println("Thread 2: Holding lock 2 and lock 1");
               }
           }
       });

       thread1.start();
       thread2.start();
   }

}
