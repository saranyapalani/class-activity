package applet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class Draw3DRectanglesExample extends Applet{
 
	public void paint(Graphics g){
		
		g.setColor(Color.red);
		/*
		 * To draw a 3-D rectangle in an applet window use,
		 * void draw3DRect(int x1,int y1, int width, int height, boolean raised)
		 * method.
		 * 
		 * This method draws a 3-D rectangle of specified width and
		 * height at (x1,y1) 
		 */
		
		//this will draw a 3-D rectangle of width 50 & height 100 at (10,10)
		g.draw3DRect(10,10,50,100,true);
		
		/*
		 * If you speficy same width and height, the draw3DRect method
		 * will draw a 3-D square!
		 */
		
		//this will draw a 3-D square
		g.draw3DRect(100,100,50,50,true);
		
		g.setColor(Color.red);
		
		/*
		 * To draw a filled 3-D rectangle in an applet window use,
		 * void fill3DRect(int x1,int y1, int width, int height, boolean raised)
		 * method.
		 * 
		 * This method draws a filled 3-D rectangle of specified width and
		 * height at (x1,y1) 
		 */
		
		//this will draw a filled 3-D rectangle of width 50 & height 100 at (10,10)
		g.fill3DRect(10,150,50,100,true);
		
		/*
		 * If you speficy same width and height, the fill3DRect method
		 * will draw a filled 3-D square!
		 */
		
		//this will draw a filled 3-D square
		g.fill3DRect(100,200,50,50,true);
	
	}
}


