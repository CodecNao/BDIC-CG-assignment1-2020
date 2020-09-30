package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ExplicitLine {
	
	Point3f Start;
	Point3f End;
	float slope; 
	 
	public ExplicitLine(Point3f Start, Point3f End) { 
		this.Start = Start;
		this.End = End;
		slope = getSlope(); // you need to implement this before the class will compile 
	}
	
	// Implement and comment what the method does
	public float getSlope(){
		 float slope = (End.y - Start.y) / (End.x - Start.x);
		 return slope;
	}
	//slope can construct the explicit line easily,normally,for two exist dots A(x1,y1) and B(x2,y2) slope =(y1-y2)/(x1-x2) 
	
	public float getInterceptOfY(Point3f s,Point3f e) {
		float I = s.y - (e.y - s.y) / (e.x - s.x) * s.x;
		return I;
	}
	public float getInterceptOfX(Point3f s,Point3f e) {
		float I = s.x - (e.x - s.x) / (e.y - s.y) * s.y;
		return I;
	}
	//these two methods show how to get intercept.
	//Already know two points and slopes,it is easily to conduct the intercept by Ax+By+C=0(slope=A/B) 
	// Implement in Explicit form, and comment what the method does
	public void drawLine(Graphics g){
		 float rise = End.y - Start.y;
		 float run = End.x - Start.x;
		 if(run > 0) {
			 if(rise > 0) {
				 if(run > rise) {
					 for(int x = Math.round(Start.x);x < Math.round(End.x);x ++) {
						 int y = (int) ((rise / run) * x + this.getInterceptOfX(Start, End));
						 this.setPixel(g,x,y);
					 }
				 }
				 else {
					 for(int y = Math.round(Start.y);y < Math.round(End.y); y ++) {
						 int x = (int) ((run / rise) *y + this.getInterceptOfY(Start, End));
						 this.setPixel(g, x, y);
					 }
				 }
			 }
			 else {
				 if(run > 0 - rise) {
					 for(int x = Math.round(Start.x);x < Math.round(End.x);x ++) {
						 int y = (int) ((rise / run) * x + this.getInterceptOfX(Start, End));
						 this.setPixel(g, x, y);
					 }
				 }
				 else {
					 for(int y = Math.round(Start.y);y < Math.round(End.y); y ++) {
						 int x = (int) ((run / rise) *y + this.getInterceptOfY(Start, End));
						 this.setPixel(g, x, y);
					 }
				 }
			 }
		 }
   
	}
	//this method show how to draw the pixel using explicit method
	//For any line which slope > 1,y=mx+c is hard to define its pixel so that using x = my+c can get the pixel of line which slope > 1.
	//I have implemented this method to adapt Swings coordinate system 
	public void setPixel(Graphics g,int x,int y)  
	{
		g.drawRect(x+500, 500-y, 1,1);  // + 500 offset is to make the centre 0,0 at centre of the screen 
		  
	}

}
