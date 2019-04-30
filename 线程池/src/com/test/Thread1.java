package com.test;

public class Thread1 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("thread1=========="+getId());
    }
}
