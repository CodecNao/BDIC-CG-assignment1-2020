package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

public class ImplicitLine {

	Point3f Start;
	Point3f End;

	public ImplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Explict form , Extra marks for reducing the search space
	// before you draw the line , and comment what the method does 
	public void drawLine(Graphics g) {
		for(int x = Math.round(Start.x);x < Math.round(End.x);x ++) {
			for(int y = Math.round(Start.y);y < Math.round(End.y);y ++) {
				Point3f thisPoint = new Point3f(x,y,0);
				if(Math.abs(Distance(thisPoint,Start,End)) < 0.5) {
					this.setPixel(g, x, y);
				}
			}
		}
	}
//For implicit line,we don't need to let the computer to know the function of the line.Only using x to calculate the y and search the dot one by one to judge whether the distance of dot near the dot of (x,y) the computer has calculated.	 
//implement Distance formulas using your notes , and comment what the method does
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		float A = End.x - Beginning.x;
		float B = End.y - Beginning.y;
		float slope = B / A;
		float InterceptOfY = Beginning.y - slope * Beginning.x;
		float dis = (float) (Math.abs((A * Check.y - B * Check.x - InterceptOfY * A)/ Math.sqrt(A * A + B * B)));
		//System.out.println(dis);
		return dis;
	}
	//This method show how to calculate the distance of a point to a line 
	//Distance:|Ax+By+C|/(A*A+B*B)^2 A,B,C are the line's constant number like line a:Ax+By+C=0;x,y are the coordinate of the point.
	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen

	}

}
