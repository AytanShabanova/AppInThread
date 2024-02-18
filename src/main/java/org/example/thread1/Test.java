package org.example.thread1;

public class Test {
    public static  void testRun(){
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

        System.out.println(Base.a);// a nin deyeri deyise biler lakin 100 den az olmaq serti ile


    }
}
