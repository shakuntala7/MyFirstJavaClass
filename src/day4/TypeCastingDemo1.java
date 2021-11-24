package day4;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		
		byte b1 = 127; // byte is small value
		int i1 = b1;   // Integer is larger value
		// implicit casting (up) by java compiler
		System.out.println(b1);
		System.out.println(i1);
		
		int i2 = 127;
		byte b2 = (byte)i2; // explicit casting (down) by java programmer 
		 
		// smaller to larger can be change but larger to small change need to do forcefully
		
		short s1 = 45;
		double d1 = s1;
		
		double d2 = 100.55;
		short s2 = (short) d2;
				

	}

}
