package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ************* a0 *************
 * pool-1-thread-1线程被调用了。
 * ************* a1 *************
 * pool-1-thread-2线程被调用了。
 * ************* a2 *************
 * pool-1-thread-1线程被调用了。
 * pool-1-thread-2线程被调用了。
 * ************* a3 *************
 * ************* a4 *************
 * pool-1-thread-2线程被调用了。
 */
public class Test1 {
    private static Thread1 thread1=new Thread1();
    private static Thread2 thread2=new Thread2();
    private static Thread1 thread3=new Thread1();
    private static Thread2 thread4=new Thread2();

    private static Runnable runnable=new TestRunnable();
    private static Runnable runnable1=new TestRunnable1();
    private static Runnable runnable2=new TestRunnable2();
    private static Runnable runnable3=new TestRunnable3();
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//      ExecutorService executorService = Executors.newFixedThreadPool(5);
      ExecutorService executorService = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new TestRunnable());
//            System.out.println("************* a" + i + " *************");
//        }
//        executorService.shutdown();
//        TestRunnable1 runnable1=new TestRunnable1();
        executorService.execute(runnable);
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        executorService.execute(runnable3);
    }
}

class TestRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程被调用了。"+"id=="+Thread.currentThread().getId());
    }
}
class TestRunnable1 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程被调用了。"+"id=="+Thread.currentThread().getId());
    }
}
class TestRunnable2 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程被调用了。"+"id=="+Thread.currentThread().getId());
    }
}
class TestRunnable3 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程被调用了。"+"id=="+Thread.currentThread().getId());
    }
}