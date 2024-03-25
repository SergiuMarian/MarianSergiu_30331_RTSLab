package org.example5;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ReadThread extends Thread{
    private PipedInputStream pi;

    ReadThread(){
        pi = new PipedInputStream();
    }

    public void run(){
        while(true){
            try {
                if(pi.available()>0){
                    System.out.println("Read Thread is received: "+pi.read());
                }
            } catch (Exception e) {}
        }

    }
    void connect(PipedOutputStream os)throws Exception{
        pi.connect(os);

    }
}
