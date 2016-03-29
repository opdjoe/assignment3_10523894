/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Q86 extends Canvas {
     @Override
     public void paint( Graphics g )
    {
          
        Polygon tri = new Polygon();
        tri.addPoint(100, 100);
        tri.addPoint(100, 300);
        tri.addPoint(200, 300);
        
        Color myOrange = new Color(204,51,255);
        g.setColor(myOrange);
        g.fillPolygon(tri);
    }
     
      public static void main(String[] args)
    {
        JFrame win = new JFrame("Polygon Demo");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new Q86() );
        win.setVisible(true);
    }

    
}
