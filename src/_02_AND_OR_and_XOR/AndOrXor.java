package _02_AND_OR_and_XOR;

public class AndOrXor {
	public static void main(String[] args) {
		// The single & is used to create a new binary value from 2 other binary values.
		// This value is created by "anding" the bits together.
		
		// EXAMPLE:
		// What is the value of 5 & 9?
		int num = 5 & 9;
		System.out.println(num); // This prints 1
		
		// 5     = 0 1 0 1
		// 9     = 1 0 0 1
		// 5 & 9 = 0 0 0 1  <--since the one column is the only column that both have a 1, the result is just 1.
		
		// Example:
		// What is the value of 2 & 6?
		// 2     = 0 1 0
		// 6     = 1 1 0
		// 6 & 2 = 0 1 0 = 2
		
		//The single | operator is used to "or" the bits together.
		// EXAMPLE:
		// What is the value of 5 | 9?
		num = 5 | 9;
		System.out.println(num); // This prints 13
		
		// 5     = 0 1 0 1
		// 9     = 1 0 0 1
		// 5 | 9 = 1 1 0 1  <--If there is a 1 in the 5 or 9 column, it produces a 1 in the same column in the result.
		
		// Example:
		// What is the value of 2 | 6?
		// 2     = 0 1 0
		// 6     = 1 1 0
		// 6 | 2 = 1 1 0 = 6
	}
}
