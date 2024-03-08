package org.example5;

public class Rectangle extends Thread{

    private volatile boolean running = true;
    private String name;
    private int distance = 0;
    private Shapes shapes;

    public Rectangle(String name, Shapes shapes) {
        setName(name);
        this.name = name;
        this.shapes = shapes;
    }

    public void run(){
        while (distance < 300){

            // simulate the rectangle moving at a random speed
            int speed = (int) (Math.random() * 10) + 1;
            distance += speed;

            shapes.updateRectanglePosition(name,distance);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        running = false;
        stop(running);

    }

    public void stop(boolean running){
        if(running == false){
            System.out.println("Running has stopped");
            stop();
        }
        System.out.println("Running has stopped");
    }

}
