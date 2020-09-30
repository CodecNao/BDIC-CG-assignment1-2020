package Line_Algorithms;

import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ParametricLine {

	Point3f Start;
	Point3f End;

	public ParametricLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Parametric form , and comment what it does 
	//this method find how to using parametric line to calculate the point.
	//       x=at+b
	//f(t)= {      restriction of t
	//       y=ct+d
	public void drawLine(Graphics g) {
		for(float t = (float) 0.0;t < 1.0;t += 0.001) {
			
			Point3f r = new Point3f(Start.x + (End.x - Start.x) * t,Start.y + (End.y - Start.y) * t,0);
			this.setPixel(g, Math.round(r.x),Math.round(r.y));
		}
		 
			// setPixel(g, (int) CurrentPoint.x, (int) CurrentPoint.y);
	 
	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen for swing :-)

	}
}
