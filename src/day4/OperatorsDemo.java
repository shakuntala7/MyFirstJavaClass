package day4;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//1. Arithmetic Operators + - / * %(modulus)
		
		System.out.println(7/3); // this is Quotient
		System.out.println(7%3); // this is remainder
		// Precedence * / % (high) + - (low)
		// Associativity: left to right 
		
		    int a = 4 + 5 - 2 * 3 / 2 - 5 % 2;
		    
		    // a = 4 + 5 - 6 / 2 - 5 % 2 
		    // a = 4 + 5 - 3 - 1
		    // a = 9 - 3 - 1
		    // a = 6 - 1
		    // a = 5
		    
		    System.out.println(a); 
		
		
		

	}

}
