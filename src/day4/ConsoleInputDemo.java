package day4;

import java.util.Scanner;

public class ConsoleInputDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter value of a: ");
		int a = input.nextInt();
		System.out.println("enter value of b: ");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println("sum is : " + sum);
		
		
		System.out.println("enter value of x: ");
		double x = input.nextDouble();
		System.out.println("enter value of y: ");
		double y = input.nextDouble();
		
		double mul = x*y;
		System.out.println("multipication is: " + mul);
		
		System.out.println("enter value of k: ");
		float k = input.nextFloat();
		System.out.println("enter value of l: ");
		float l = input.nextFloat();
		 float div = k/l;
		 System.out.println("division is: " + div);
				
	
		
	}

}
