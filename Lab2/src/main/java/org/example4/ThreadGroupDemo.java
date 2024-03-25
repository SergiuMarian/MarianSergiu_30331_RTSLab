package org.example4;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Group of threads");

        ThreadEx t1 = new ThreadEx(tg,"ThreadEx #1");
        ThreadEx t2 = new ThreadEx(tg,"ThreadEx #2");
        ThreadEx t3 = new ThreadEx(tg,"ThreadEx #3");

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(tg.activeCount() + " Thread in group.");

        Thread thrds[] = new Thread[tg.activeCount()];

        tg.enumerate(thrds);

        for(Thread t: thrds){
            System.out.println(t.getName());
        }

        t1.stopThread();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(tg.activeCount() + "Thread in group.");
        tg.interrupt();


    }
}
