package GraphicsObjects;



public class Vector3f {

	public float x=0;
	public float y=0;
	public float z=0;
	
	public Vector3f() {  
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	 
	public Vector3f(float x, float y, float z) { 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	 //implement Vector plus a Vector  and comment what the method does  
	public Vector3f PlusVector(Vector3f Additonal) { 
		Vector3f plus = new Vector3f(this.x + Additonal.x,this.y + Additonal.y,this.z + Additonal.z);
		return plus;
	} 
	//Vector plus Vector equals Vector and it x and y value equal original plus to each other.
	
	 //implement Vector minus a Vector  and comment what the method does  
	public Vector3f MinusVector(Vector3f Minus) { 
		Vector3f minus = new Vector3f(this.x - Minus.x,this.y - Minus.y,this.z - Minus.z);
		return minus;
	}
	//vector minus vector is similarity as the plus condition.
	//implement Vector plus a Point and comment what the method does  
	public Point3f PlusPoint(Point3f Additonal) { 
		Point3f plus = new Point3f(this.x + Additonal.x,this.y + Additonal.y,this.z + Additonal.z);
		return plus;
	} 
	//Do not implement Vector minus a Point as it is undefined 
	//vector plus a point equals a point ,the same as a point plus a vector. 
	//Implement a Vector * Scalar  and comment what the method does    ( we wont create Scalar * Vector due to expediency ) 
	public Vector3f byScalar(float scale ){
		 Vector3f mult = new Vector3f(this.x * scale,this.y * scale,this.z * scale);
		 return mult;
	}
	//Vector multiple a constant value is multiply the value times in its x,y and z.
	
	//implement returning the negative of a Vector  and comment what the method does  
	public Vector3f  NegateVector(){
		Vector3f reverse = new Vector3f(0 - this.x,0 - this.y,0 - this.z);
		 return reverse;
	}
	//Vector a = (x,y,z),its negate vector is -a(-x,-y,-z) 
	
	//implement getting the length of a Vector    and comment what the method does
	public float length(){
	   float distance = (float) Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z)); 
	   return distance;
	}
	//The length of a vector is the square root of the sum of the squares of its X, y, Z values
	//the length of a(x,y,z) is (x*x+y*y+z*z)^2
	//implement getting the Normal  of a Vector   and comment what the method does
	// Remember that since you just have one vector, this method is returning a normalized vector with a one unity length 
	public Vector3f Normal(){
		
		 Vector3f normal2D = new Vector3f((float) (0-this.y) / this.length(),(float)this.x / this.length(),(float)0.0); 
		 return normal2D;
	} 
	//in a 2d plant,if a(x,y),b(-y,x),a dot b equal -xy+yx=0,then these two vectors are normal to each other. equal itself length can get its unity length vector in this direction. 
	//implement getting the dot product of Vector.Vector and comment what the method does 

	public float dot(Vector3f v){ 
		float dot = (this.x * v.x) + (this.y * v.y) + (this.z * v.z);
		return dot;
	}
	//a(x1,y1) dot b(x2,y2) equals a constant number x1*x2+y1*y2.
	//implement getting the cross product of Vector X Vector and comment what the method does  
	public Vector3f cross(Vector3f v)  { 
		Vector3f cross = new Vector3f((this.y * v.z) - (this.z * v.y),(this.z * v.x) - (this.x * v.z),(this.x * v.y) - (this.y * v.x));
		return cross;
	}
	//cross means using the matrix to express two vector and
	//a(x1,y1,z1) x b(x2,y2,z2)=  | i  j  k |(i)     =   (y1z2-y2z1,z1x2-z2x1,x1y2-x2y1)
	//                            | x1 y1 z1|(x1)
	//                            | x2 y2,z2|(x2)
	//
}
	 
	   

/*

										MMMM                                        
										MMMMMM                                      
 										MM MMMM                                    
 										MMI  MMMM                                  
 										MMM    MMMM                                
 										MMM      MMMM                              
  										MM        MMMMM                           
  										MMM         MMMMM                         
  										MMM           OMMMM                       
   										MM             .MMMM                     
MMMMMMMMMMMMMMM                        MMM              .MMMM                   
MM   IMMMMMMMMMMMMMMMMMMMMMMMM         MMM                 MMMM                 
MM                  ~MMMMMMMMMMMMMMMMMMMMM                   MMMM               
MM                                  OMMMMM                     MMMMM            
MM                                                               MMMMM          
MM                                                                 MMMMM        
MM                                                                   ~MMMM      
MM                                                                     =MMMM    
MM                                                                        MMMM  
MM                                                                       MMMMMM 
MM                                                                     MMMMMMMM 
MM                                                                  :MMMMMMMM   
MM                                                                MMMMMMMMM     
MM                                                              MMMMMMMMM       
MM                             ,MMMMMMMMMM                    MMMMMMMMM         
MM              IMMMMMMMMMMMMMMMMMMMMMMMMM                  MMMMMMMM            
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM               ZMMMMMMMM              
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          MM$             MMMMMMMMM                
MMMMMMMMMMMMMM                       MMM            MMMMMMMMM                  
  									MMM          MMMMMMMM                     
  									MM~       IMMMMMMMM                       
  									MM      DMMMMMMMM                         
 								MMM    MMMMMMMMM                           
 								MMD  MMMMMMMM                              
								MMM MMMMMMMM                                
								MMMMMMMMMM                                  
								MMMMMMMM                                    
  								MMMM                                      
  								MM                                        
                             GlassGiant.com */