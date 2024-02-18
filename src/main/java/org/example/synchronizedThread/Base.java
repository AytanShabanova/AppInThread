package org.example.synchronizedThread;

public class Base {
    public static volatile int a=0;
    public  synchronized static  int getA(){
        return a;

    }
    public static synchronized void incA(){
                    a++;
    }
}
