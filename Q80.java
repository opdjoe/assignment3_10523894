/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Q80 extends Canvas {
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.fillOval(200, 100, 150, 150);
    }
    public static void main(String [] args )
    {
        JFrame win = new JFrame("Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Q80 canvas = new Q80() ;
        win.add( canvas );
        win.setVisible(true);
        
    }
    
}
