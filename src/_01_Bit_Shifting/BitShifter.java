package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		System.out.println(Integer.toBinaryString(num));
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		//System.out.println(numShifted);
		//System.out.println(Integer.toBinaryString(numShifted));
		
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		//It shifts the binary number the given amount of places to the left
		
		// 4. Try shifting num 3 places.
		numShifted = num << 3;
		System.out.println(numShifted);
		System.out.println(Integer.toBinaryString(numShifted));
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
