package org.example4;

public class ThreadEx extends Thread{
    boolean stop;

    ThreadEx(ThreadGroup tg, String name){
        super(tg, name);
        stop = false;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " ON.");

        try{
            for(int i = 1; i< 1000; i++){
                System.out.println(".");
                Thread.sleep(250);
                synchronized (this){
                    if(stop) break;
                }
            }
        }catch (Exception exc){
            System.out.println(Thread.currentThread().getName()+ " interrupt.");
        }
        System.out.println(Thread.currentThread().getName() + " The End.");
    }

    public void stopThread(){
        stop=true;
    }
}
