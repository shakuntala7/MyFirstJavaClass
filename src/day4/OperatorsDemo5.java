package day4;

public class OperatorsDemo5 {

	public static void main(String[] args) {
		// 5. Logical Operators &&(and) ||(or) !(not)
		
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		int a = 15, b = 14, c =7;
		
		System.out.println((a > b) && (a > c)); // true
		System.out.println((a > b) && (c > a)); // false
		System.out.println((a < b) && (a < c)); // false
		System.out.println((b > a) && (b > c)); // false

		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false 
		
		System.out.println((a > b) || (a > c)); // true
		System.out.println((a > b) || (c > a)); // true
		System.out.println((a < b) || (a < c)); // false
		System.out.println((b > a) || (b > c)); // true

		
		
	

	}

}
