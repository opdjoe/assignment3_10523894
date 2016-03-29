/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Q82 extends Canvas {
     @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
       // g.setFont(new Font("Consolas", Font.BOLD,15));
        g.drawOval(200, 100, 150, 150);
        g.fillOval(275, 175, 5, 5);
        g.setFont(new Font("Consolas", Font.BOLD,15));
        g.drawString("12", 270, 125);
        g.drawString("6", 272, 235);
        g.drawString("9", 210, 182);
        g.drawString("3", 335, 182);
        g.drawLine(275, 175, 335, 175);
        g.drawLine(275, 175, 275, 215);
    }
      
     public static void main(String [] args )
    {
        JFrame win = new JFrame("Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Q82 canvas = new Q82() ;
        win.add( canvas );
        win.setVisible(true);
        
    }
    
}
