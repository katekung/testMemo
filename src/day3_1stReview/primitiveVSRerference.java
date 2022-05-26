package day3_1stReview;

import java.awt.Point;

public class primitiveVSRerference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1; // Initialize x to 1
		int y = x; // assign x into y
		x = 2; // reassign x to 2
		System.out.println("x="+x+",y="+y);
		
		//================================
		
		
		//Point pointA = new Point(1,1); //1,1
		//Point pointB = pointA; //1,1
		//pointA.y = 2; // 1,2
		//System.out.println("PointA="+pointB+",Point1B="+pointB);
		
		//String xx = new String("1"); same the next line 
		//String xx = ("1");
		//String yy = xx;
		//xx = "2";
		//System.out.println("xx="+xx+",+yy");
		// it can't print
		
		
		Point pointA = new Point(1,1); //pointA = 1,1;
		Point pointB = pointA; //1,1 | PointA = 1,1
		pointA.y = 2; // 1,2 | PointB = 1,2
		
		System.out.println("PointA="+pointA+",Point1B="+pointB);// Point
	}
	

}
