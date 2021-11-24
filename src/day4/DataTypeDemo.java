package day4;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		byte b1 = 127; // max value
		byte b2 = -128; // min value
		
		short s1 = 32627; // max value
		short s2 = -32628; // min value
		
		long l1 = 922337203685477580l; // max value
		long l2 = -9223372036854775808l; // min value
		
		int i1 = 2147483647; // max value
		int i2 = -2147483648; // min value
		
		float f1 = 3.4028235E38f; // max value
		float f2 = 1.4E-45f; // min value
		
		double d1 = 1.7976931348623157E308; //max value
		double d2 = 4.9E-324; //min value
		
		char c1 = 65535; // max value
		char c2 = 0; // min value

		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);


	}

}
