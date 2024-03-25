package org.example1;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    private static boolean stopThreads = false;
    public static AtomicBoolean flag = new AtomicBoolean(false);
    public static Object lock = new Object();

    public static void main(String[] args) {

        FileService service = new FileService("messages.txt");
        RThread reader = new RThread(service);
        WThread writer = new WThread(service);


        reader.start();
        writer.start();


    }
    public static boolean isStopThreads(){
        return stopThreads;
    }
}
