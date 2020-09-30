import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GraphicsObjects.Point3f;
import Line_Algorithms.ExplicitLine;
import Line_Algorithms.ImplicitLine;
import Line_Algorithms.ParametricLine;
import Triangle_Algorithms.ParametricTriangle;

/*
 * 
 * This class to test your work and for you to make lines to draw your house , it will not compile till all the methods are complete in the other classes 
 * 
 */
public class Drawing2D extends JPanel {

	public Drawing2D() // set up graphics window
	{
		setBackground(Color.WHITE);

	}

	public void paintComponent(Graphics g) // draw graphics in the panel
	{
		int width = getWidth(); // width of window in pixels
		int height = getHeight(); // height of window in pixels

		// as swing starts at 0 , 0 , will need to modify drawing

		super.paintComponent(g); // call superclass to make panel display
									// correctly

		g.setColor(Color.BLACK);
		
		//line test code 
		
		/*ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		
		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);*/
		
		// Remove the comments for Explicit line and test it ,
		/*
		ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);

		// */

		// Remove the comments for Implicit line and test it
		/*
		ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);

		// Remove the comments for Parametric line and test it
		/*
		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);
		// */

		// Remove the comments for an example of square using Parametric lines
		/*
		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);
		// */

		//ParametricTriangle MyFirstTriangle = new ParametricTriangle(new Point3f(200, 0, 0), new Point3f(400,200, 0),
				//new Point3f(200, 370, 0));
//y=x+200     --- x-y-200=0    (200-370+200)/1.414
		// MyFirstTriangle.drawTriangle(g);// */
		
		//insert your house drawings  here 
		
		ParametricTriangle roof = new ParametricTriangle(new Point3f(-100,0,0),new Point3f(100,0,0),new Point3f(0,100,0));
		roof.drawTriangle(g);
		ParametricLine body1 = new ParametricLine(new Point3f(-100,0,0),new Point3f(-100,-150,0));
		g.setColor(Color.black);
		body1.drawLine(g);
		ParametricLine body2 = new ParametricLine(new Point3f(-100,-150,0),new Point3f(100,-150,0));
		body2.drawLine(g);
		ParametricLine body3 = new ParametricLine(new Point3f(100,-150,0),new Point3f(100,0,0));
		body3.drawLine(g);
		ParametricLine door1 = new ParametricLine(new Point3f(50,-150,0),new Point3f(50,-125,0));
		door1.drawLine(g);
		ParametricLine door2 = new ParametricLine(new Point3f(50,-125,0),new Point3f(75,-125,0));
		door2.drawLine(g);
		ParametricLine door3 = new ParametricLine(new Point3f(75,-125,0),new Point3f(75,-150,0));
		door3.drawLine(g);
		g.setColor(Color.blue);
		ParametricLine window1 = new ParametricLine(new Point3f(-10,-80,0),new Point3f(10,-80,0));
		window1.drawLine(g);
		ParametricLine window2 = new ParametricLine(new Point3f(-10,-80,0),new Point3f(-10,-60,0));
		window2.drawLine(g);
		ParametricLine window3 = new ParametricLine(new Point3f(-10,-60,0),new Point3f(10,-60,0));
		window3.drawLine(g);
		ParametricLine window4 = new ParametricLine(new Point3f(10,-60,0),new Point3f(10,-80,0));
		window4.drawLine(g);
		ParametricLine window5 = new ParametricLine(new Point3f(15,-80,0),new Point3f(35,-80,0));
		window5.drawLine(g);
		ParametricLine window6 = new ParametricLine(new Point3f(35,-80,0),new Point3f(35,-60,0));
		window6.drawLine(g);
		ParametricLine window7 = new ParametricLine(new Point3f(35,-60,0),new Point3f(15,-60,0));
		window7.drawLine(g);
		ParametricLine window8 = new ParametricLine(new Point3f(15,-60,0),new Point3f(15,-80,0));
		window8.drawLine(g);
		ParametricLine window9 = new ParametricLine(new Point3f(-10,-55,0),new Point3f(10,-55,0));
		window9.drawLine(g);
		ParametricLine window10 = new ParametricLine(new Point3f(10,-55,0),new Point3f(10,-35,0));
		window10.drawLine(g);
		ParametricLine window11 = new ParametricLine(new Point3f(10,-35,0),new Point3f(-10,-35,0));
		window11.drawLine(g);
		ParametricLine window12 = new ParametricLine(new Point3f(-10,-35,0),new Point3f(-10,-55,0));
		window12.drawLine(g);
		ParametricLine window13 = new ParametricLine(new Point3f(15,-55,0),new Point3f(35,-55,0));
		window13.drawLine(g);
		ParametricLine window14 = new ParametricLine(new Point3f(35,-55,0),new Point3f(35,-35,0));
		window14.drawLine(g);
		ParametricLine window15 = new ParametricLine(new Point3f(35,-35,0),new Point3f(15,-35,0));
		window15.drawLine(g);
		ParametricLine window16 = new ParametricLine(new Point3f(15,-35,0),new Point3f(15,-55,0));
		window16.drawLine(g);
		g.setColor(Color.red);
		ParametricLine chimney1 = new ParametricLine(new Point3f(-75,25,0),new Point3f(-75,60,0));
		chimney1.drawLine(g);
		ParametricLine chimney2 = new ParametricLine(new Point3f(-75,60,0),new Point3f(-50,60,0));
		chimney2.drawLine(g);
		ParametricLine chimney3 = new ParametricLine(new Point3f(-50,60,0),new Point3f(-50,50,0));
		chimney3.drawLine(g);
	}
//using the class the CG assignment 1 given previously to draw the house,window and chimney. 
	public static void main(String[] args) {
		Drawing2D panel = new Drawing2D();
		JFrame ScreenToDrawOn = new JFrame();
		ScreenToDrawOn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenToDrawOn.setTitle("2D Drawing Application");
		ScreenToDrawOn.setSize(1000, 1000); // window is 500 pixels wide, 400
											// high
		ScreenToDrawOn.setVisible(true);
		ScreenToDrawOn.add(panel);

	}

}
