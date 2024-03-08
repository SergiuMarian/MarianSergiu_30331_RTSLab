package org.example5;

import javax.swing.*;
import java.awt.*;


public class Main{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Application 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Shapes shapes = new Shapes();

        frame.getContentPane().add(shapes);
        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);


        Rectangle rectangle1 = new Rectangle("0",shapes);
        Rectangle rectangle2 = new Rectangle("1",shapes);
        Rectangle rectangle3 = new Rectangle("2",shapes);

        rectangle1.start();
        rectangle2.start();
        rectangle3.start();










    }

}