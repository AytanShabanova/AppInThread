package org.example.thread;

public class MyWorker extends Thread{
    private String name;
    public MyWorker(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+"is processed ");
    }


}
