package com.test;

public class Test extends Thread {
    public Object object=new Object();
    public static void main(String[] args) {
        new Test().start();

    }

    @Override
    public void run() {
        super.run();
        while (true){

            test();
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }
    }

    public synchronized void test(){
        System.out.println("test");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
