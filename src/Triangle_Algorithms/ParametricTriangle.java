package Triangle_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

public class ParametricTriangle {

	Point3f A;
	Point3f B;
	Point3f C;

	public ParametricTriangle(Point3f a, Point3f b, Point3f c) {
		A = a;
		B = b;
		C = c;
	}
	 

	// Implement in Parametric form ,and comment what it does 
	//Judge whether a point exist in triangle can using  Barycentric Coordinates.
	//The three points of the triangle are in the same plane. If one of the points is selected, the other two points are just the displacement relative to the point. For example, if point a is selected as the starting point, then point B is equivalent to moving a certain distance in AB direction, while point C is equivalent to moving a certain distance in AC direction.
	//So any point in the plane can be expressed by the following equation
	//P = a + U * (C – a) + V * (B - a) / / equation 1
		//	If the coefficient u or V is negative, then it is equivalent to moving in the opposite direction, namely BA or ca. So if we want p to be inside the triangle ABC, what conditions must u and V satisfy? There are three conditions
		//	u >= 0
		//	v >= 0
		//	u + v <= 1
		//	For several boundary cases, when u = 0 and V = 0, it is point a; when u = 0, v = 1, it is point B; when u = 1, v = 0, it is point C
		//	By sorting out equation 1, we get P – a = u (C - a) + V (B - a)
		//	Let V0 = C – a, V1 = B – a, V2 = P – a, then V2 = u * V0 + V * v1. Now it is an equation with two unknowns, and u and V cannot be solved. Multiply the two sides of the equation by V0 and V1 respectively
		//	(v2) • v0 = (u * v0 + v * v1) • v0
		//	(v2) • v1 = (u * v0 + v * v1) • v1
		//	Notice that u and V are numbers and V0, V1 and V2 are vectors, so we can expand the dot product to get the following formula.
		//	V2 · V0 = u * (V0 · V0) + V * (V1 · V0) / / Formula 1
		//	V2 · V1 = u * (V0 · V1) + V * (V1 · V1) / / formula 2
		//	By solving this equation
		//	u = ((v1•v1)(v2•v0)-(v1•v0)(v2•v1)) / ((v0•v0)(v1•v1) - (v0•v1)(v1•v0))
		//	v = ((v0•v0)(v2•v1)-(v0•v1)(v2•v0)) / ((v0•v0)(v1•v1) - (v0•v1)(v1•v0))
	public void drawTriangle(Graphics g) {
		Vector3f v0 = new Vector3f(C.x - A.x,C.y - A.y,0);
		Vector3f v1 = new Vector3f(B.x - A.x,B.y - A.y,0);
		float temp = (A.x > B.x)?A.x:B.x;
		float maxX = (temp > C.x)?temp:C.x;
		temp = (A.x < B.x)?A.x:B.x;
		float minX = (temp < C.x)?temp:C.x;
		temp = (A.y > B.y)?A.y:B.y;
		float maxY = (temp > C.y)?temp:C.y;
		temp = (A.y < B.y)?A.y:B.y;
		float minY = (temp < C.y)?temp:C.y;
		for(float x = minX;x <= maxX;x ++) {
			for(float y = minY;y <= maxY;y ++) {
				Point3f point = new Point3f(x,y,0);
				Vector3f v2= new Vector3f(point.x - A.x,point.y - A.y,(float)0.0);
				float dot00 = v0.dot(v0);
				float dot01 = v0.dot(v1);
				float dot02 = v0.dot(v2);
				float dot11 = v1.dot(v1);
				float dot12 = v1.dot(v2);
				float inverDeno = 1 / (dot00 * dot11 - dot01 * dot01);
				float alpha = (dot11 * dot02 - dot01 * dot12) * inverDeno;
				float gamma = (dot00 * dot12 - dot01 * dot02) * inverDeno;
				float beta = 1 - alpha - gamma;
				//System.out.println("alpha:"+alpha+"    beta"+beta+"   gamma"+gamma);
				if(alpha > 0.0 && beta > 0.0 &&gamma > 0.0) {
					this.setPixel(g, (int)x, (int)y, alpha, beta, gamma);
				}
			}	
		}
	}

	//I have implemented this method to adapt Swings coordinate system 
	public void setPixel(Graphics g, int x, int y, float R, float G, float B) {
 
		Color pixelColour = new Color(R, G, B);
		g.setColor(pixelColour);
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen

	}

	//Implement the distance ,  you may use your previous Distance formulas and comment what it does 
	//For this method,using vector dot can calculate the distance between line and point more easily.
	// distance=(vectorN dot vectorV) / the length of vectorN
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		Vector3f AAndCheck = new Vector3f(Check.x - Beginning.x,Check.y - Beginning.y,0);
		Vector3f AB = new Vector3f(End.x - Beginning.x,End.y - Beginning.y,0);
		float dis = AAndCheck.dot(AB.Normal());
		//System.out.println("dis:"+dis);
		return dis;

	}

}
