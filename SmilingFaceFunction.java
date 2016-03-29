import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		 g.setColor(Color.yellow);
            g.fillOval(0,0,300,300);
            g.setColor(Color.blue);
            g.fillOval(45,50,50,50);
            g.fillOval(200,50,50,50);
            g.setColor(Color.red);
            g.fillArc(100,200,100,5,180,180);
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}

