package org.example1;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.example1.Main.flag;
import static org.example1.Main.lock;

public class RThread extends Thread{
    FileService service;


    public RThread(FileService service) {
        this.service = service;
    }

    @Override
    public void run(){
        while (!Main.isStopThreads()) {

            synchronized (lock) {
                flag.set(true);
                lock.notify();
                while (flag.get()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                try {
                    String readMsg = service.read();
                    System.out.println(readMsg);
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }




            }

        }

    }
}
