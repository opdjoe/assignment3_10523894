/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10528808;

/**
 *
 * @author Mawutor
 */
import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  1 - make them manually                               **
 ***********************************************************************************/

public class Boxy extends Canvas
{
	public void paint( Graphics window )
	{
		// this code draws a 100x100 box in blue at (200,300)
		window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);
                window.setColor(Color.green);
		window.fillRect(400,600,100,100);
                window.setColor(Color.BLUE);
		window.fillRect(100,150,100,100);
                window.setColor(Color.yellow);
		window.fillRect(300,400,100,100);
                window.setColor(Color.cyan);
		window.fillRect(410,210,100,100);
		
		// draw three more boxes -- different colors, different places
	}

	public static void main( String[] args )
	{
		Canvas canvas = new Boxy();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
