package org.example.thread;

public class Test {
    public static  void testThread(){
        MyWorker w1=new MyWorker("A");
        MyWorker w2=new MyWorker("B");
        MyWorker w3=new MyWorker("C");
        MyWorker w4=new MyWorker("D");
        MyWorker w5=new MyWorker("E");
        MyWorker w6=new MyWorker("F");
        MyWorker w7=new MyWorker("K");
        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();
        w6.start();
        w7.start();
    }
}
