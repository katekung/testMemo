package day3_1stReview;

public class PrintFunction {

	public static void main(String[] args) {
		System.out.println(); // print to the console then end with new line
		System.out.print("Hello");
		System.out.print(" World");
		System.out.println( );
		System.out.println("Hello World");
		System.out.printf("Hello World");
		// %s = string
		// %d = digit (byte, short, int, long)
		// %f = float (float, double)
		// %b = boolean	
		// %.2f = f
		
		System.out.println( );
		
		int age = 31;
		String message = "World";
		boolean isEligible = false;
		//						v            v		
		
		System.out.printf("Hello %s! Leng is %d","World",34);
		System.out.println();
		System.out.printf("Leng is %d years old.",age);
		System.out.println();
		System.out.printf("Price is %f cheaper",4.35);
		System.out.println();
		System.out.printf("%b is not eligble", isEligible);
		System.out.println("My age is "+age+" year old");
		System.out.printf("My age is %d year old", age);
				
		
	}

}
