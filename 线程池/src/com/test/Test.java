package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    private static Thread1 thread1=new Thread1();
    private static Thread2 thread2=new Thread2();
    private static Thread1 thread3=new Thread1();
    private static Thread2 thread4=new Thread2();
    public static void main(String[] args){
//        ExecutorService executorService= Executors.newCachedThreadPool();
//        executorService.execute(thread1);
//        executorService.execute(thread2);
//        executorService.execute(thread3);
//        executorService.execute(thread4);
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
    }
}
