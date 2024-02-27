package org.example.synchronizedBlock;

public class MyProducer {
    public void dto1(){
        System.out.println("dto1 start");
        synchronized (this){// monitor
        System.out.println("dto1");}
        System.out.println("dto1 bitdi");

    }
    public void dto2(){
        System.out.println("dto2 start");
        synchronized (this){
        System.out.println("dto2");}
        System.out.println("dto2 bitdi");

    }
    public void dto3(){
        System.out.println("dto3 start");
        synchronized (this){
        System.out.println("dto3");}

        System.out.println("dto3 bitdi");

    }
}
