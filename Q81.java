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
public class Q81 extends Canvas {
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
g.setFont(new Font(null));
for ( int X=0; X<800; X += 50 )
    g.drawString( String.valueOf(X), X, 50 );
for ( int Y=100; Y<600; Y += 50 )
    g.drawString( String.valueOf(Y), 28, Y );
// lines
g.setColor(Color.lightGray);
for ( int X=0; X<800; X += 50 )
    g.drawLine(X,0,X,599);    
for ( int Y=0; Y<600; Y += 50 )
    g.drawLine(0,Y,799,Y);

g.setColor(Color.yellow);
g.fillOval(300, 150, 150, 150);
g.setColor(Color.blue);
g.fillOval(320, 190, 30, 30);
g.fillOval(400, 190, 30, 30);
g.setColor(Color.red);
g.drawArc(350, 255, 50, 20, 180, 180);
        
    }
    public static void main(String [] args )
    {
        JFrame win = new JFrame("Smiley");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(800, 600);
        Q81 canvas = new Q81();
        win.add(canvas) ;
        win.setVisible(true);
        
    }
    
}
