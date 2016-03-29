import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color    x    y
		drawBox( window, Color.RED, 50, 110 );
		drawBox( window, Color.BLACK, 500, 300 );
		drawBox( window, Color.BLUE, 200, 500 );
		drawBox( window, Color.CYAN, 250, 750 );
		drawBox( window, Color.PINK, 120, 240 );
		drawBox( window, Color.GRAY, 600, 450 );
		drawBox( window, Color.GREEN, 180, 200 );
		drawBox( window, Color.DARK_GRAY, 690, 300 );
		drawBox( window, Color.ORANGE, 110, 300 );
		drawBox( window, Color.MAGENTA, 275, 30 );
		drawBox( window, Color.YELLOW, 400, 300 );

		// draw ten more boxes -- different colors, different places
	}
	
	public void drawBox( Graphics window, Color c, int x, int y )
	{
		// already finished; do not modify
		
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
