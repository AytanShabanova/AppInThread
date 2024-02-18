package org.example.synchronizedThread;

import org.example.thread1.MyConsumer;

import java.util.SortedMap;

public class TestRun {
    public static void testRun(){
        System.out.println("Thread count="+Thread.activeCount());
        Thread [] threads=new Thread[100];
        for (int i = 0; i <100 ; i++) {
            threads[i]=new Thread(new MyConsumer("test"));

        }
        for (int i = 0; i <100 ; i++) {
            threads[i].start();

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread count="+Thread.activeCount());
        System.out.println(Base.getA());


    }
}
