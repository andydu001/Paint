package org.example;

import javax.swing.*;

public class ALSpaint extends JFrame {
    ALSpaint(){

        setTitle("AlSpaint");
        setSize(1400,1400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        add(new Eg4rGraphics());
    }
}
