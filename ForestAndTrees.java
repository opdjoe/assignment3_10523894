import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;


public class ForestAndTrees extends Canvas
{
    public void drawTree( Graphics g,int v, int n  )
	{
		g.setColor( new Color(134,83,0) );	// defines a brownish color

		// * write code here to draw the trunk using fillRect
               
                g.fillRect(125,300,32,100);

		// * write code here to create and draw a polygon for branches
                Polygon tri = new Polygon();
		tri.addPoint(150, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);
                g.setColor(Color.green);
                g.fillPolygon(tri);
                
	}
	public void paint( Graphics g )
	{
		// draws a few single trees for testing
		drawTree(g,30,550);
		drawTree(g,100,580);
		drawTree(g,640,300);
		drawTree(g,730,370);

		// draws the first forest
		g.drawRect(10,10,500,500);
		drawForest(g,10,10,500,500);

		// draws the second forest
		g.drawRect(550,20,400,250);
		drawForest(g,550,20,400,250);

		// draws the third forest
		g.drawRect(200,530,710,160);
		// * write code here to call drawForest() with the same dimensions as the rectangle above
	}
	
	

	public void drawForest( Graphics g, int x, int y, int w, int h )
	{
		// creates a box to demonstrate the forest's boundary
		g.setColor(Color.black);
		g.drawRect(500,300,300,300);

		// * write code here to make a loop that repeats 100 times or so
                for(int i=1;i<=100;i++)
		{
                    
                    Random r= new Random();
                    
                
			int a=r.nextInt(150);
                        int b=r.nextInt(60);
			// * write code here to give 'a' a random value from [0 , w-50],  (assuming your tree is 50px wide)
                        
			// * write code here to give 'b' a random value from [0 , h-100], (assuming your tree is 100px tall)
			
			drawTree(g,x+a,y+b);
		}
	
        }
	public static void main(String[] argS)
	{
		JFrame win = new JFrame("ForestAndTrees");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ForestAndTrees() );
		win.setVisible(true);
	}

}

