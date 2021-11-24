package day4;
public class OperatorsDemo3 {

	public static void main(String[] args) {
		// 3. Increment/Decrement Operators
		//++/--
		// post/pre
		//a++ a-- /++a --a
		int a= 5;
		System.out.println(a);
		a++; //a=a+1
		System.out.println(a);
// post means use first then pay later
		// pre means pay first then use
		
		// in operation post means operators done then value increment
		// in operation pre means value increment then operators done
		
		int x = 7;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		
		int y = 7;
		System.out.println(y);
		System.out.println(++y);
		System.out.println(y);
		
				
	}

}
