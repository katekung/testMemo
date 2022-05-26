package day3_1stReview;

public class Variable {

	public static void main(String[] args) {
		// IntelliJ
		// Directory = folder, package 
		// IDE - integrate development environment
	
		// Compile & Run
		// Syntax = format of the code that you need to follow
		// Declare
		// variableType variableName;
		// byte, short, int, long, float, double, boolean, char
		int age;
		
		int numA = 1;
		int numB = 2;
		//Initialize = assign value to variable
		// = assignment operator
		age = numA+numB;
				
		System.out.println(age);
		
			
		// Primiitive
		// byte, short, int, long, float, double, boolean, char => (int, double, boolean, char)
		// byte = 127
		
		int maxOfByte = Byte.MAX_VALUE;
		System.out.println(maxOfByte);
		
		// Reference
		// String

		// constant or Final Variable = variable that cannot be reassigned it is final
		// Syntax
		final byte DAY_OF_THE_WEEK; // Naming convention + screaming snake case
		DAY_OF_THE_WEEK = 7;
		final short NUMBER_OF_MONTH = 12;
		final double PI = 3.14;
		//PI = 2.5; // cannot be reassigned
		//DAY_OF_THE_WEEK = 8; | 
		
//		Naming convention
//		Class name = Pascal case
//		Variable & Method name = camelCase
//		Final Variable/ Constant = SCREAMING_SNAKE_CASE
		
	
		
		
		

	}

}
