package brickBracker;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();

        obj.setTitle("Brick Breaker");
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //obj.setBounds(10, 10, 700, 600);
        obj.setResizable(false);

        obj.add(gameplay);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }
}



