package org.example1;
import static org.example1.Main.flag;
import static org.example1.Main.lock;
public class WThread extends Thread{
    FileService service;

    public WThread(FileService service) {
        this.service = service;
    }

    @Override
    public void run(){
        while(!Main.isStopThreads()){
            synchronized (lock){

                while(!flag.get()){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


                String msg = String.valueOf(Math.round(Math.random()*100));
                service.write(msg);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                flag.set(false);
                lock.notify();
            }

        }

    }
}
