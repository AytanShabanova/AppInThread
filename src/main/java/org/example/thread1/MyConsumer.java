package org.example.thread1;

public class MyConsumer implements Runnable{
    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        while (true) {
//           int index= Base.list.size() - 1;
//           if (index>-1) { String s = Base.list.remove(index);
//               System.out.println( name+s + "removedddddddddd");
//
//           }else {
//               System.out.println("do not work");
//           }
//        }
        System.out.println("i am started and waiting ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Base.a++;


    }
}
