package org.example;

import javax.swing.*;
import java.awt.*;

public class Eg4rGraphics extends JComponent {

//Paint a background

    @Override
    protected void paintComponent(Graphics g) {
        int[] height = {120,125,130,135,140,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,1};
        int[] width = {120,125,130,135,140,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,222,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,1};
        int[] start_angle = {-2,-6,-6,-56,-23,-12,-4};
        int[] arc_angle = {-1,-23,-45,-56,-34,-2,0};
        for (int i = 0; i < height.length; i++) {

            for (int j = 0; j < width.length; j++) {

                for (int k = 0; k < start_angle.length; k++) {

                    for (int l = 0; l < arc_angle.length; l++) {

                        g.drawArc(100,100,width[j],height[i],start_angle[k],arc_angle[l]);

                    }
                }
            }
        }

    }
}