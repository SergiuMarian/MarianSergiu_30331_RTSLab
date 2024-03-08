package org.example5;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

    private int[] recPositions;
    private String[] recNames;

    public Shapes(){
        recPositions = new int[3];
        recNames = new String[]{"0","1","2"};
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i = 0; i < 3; i++){
            int yPos = recPositions[i];
            int xPos = 50 * i + 50 ;
            int recSize = 40;

            g.fillRect(xPos,yPos,recSize,recSize);
            g.setColor(Color.BLACK);
        }
    }

    public void updateRectanglePosition(String recName, int distance){
        int recIndex = getRecIndex(recName);
        if(recIndex != -1){
            recPositions[recIndex] = distance;
            repaint();
        }
    }

    private int getRecIndex(String recName){
        for (int i = 0; i < 3; i++) {
            if (recNames[i].equals(recName)) {
                return i;
            }
        }
        return -1;

    }

}
