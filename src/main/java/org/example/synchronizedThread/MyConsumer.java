package org.example.synchronizedThread;


public class MyConsumer implements Runnable{
    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    System.out.println("i am started and waiting ");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    Base.incA();



    }
}
