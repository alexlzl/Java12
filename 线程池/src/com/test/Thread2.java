package com.test;

public class Thread2 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("thread2=========="+getId());
    }
}
