package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public void printByteBinary(byte b) {
		print(8, (long) b);
	}

	public void printShortBinary(short s) {
		print(16, (long) s);
	}

	public void printIntBinary(int i) {
		print(32, (long) i);
	}

	public void printLongBinary(long l) {
		print(64, l);
	}
	
	private void print(int places, long num) {
		int i = 0;
		while ((long) Math.pow(2, i) <= num) {
			i++;
		}
		i--;
		boolean[] arr = new boolean[places];
		long complete = 0;
		while (complete < num) {
			if ((complete + (long) Math.pow(2, i)) <= num) {
				arr[i] = true;
				complete += (long) Math.pow(2, i);
			}
			i--;
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			if (arr[j])
				System.out.print("1");
			else
				System.out.print("0");
		}
	}

	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		byte b = 31;
		short s = 642;
		int i = 10000;
		long l = 5400000 * 1000000;
		
		bp.printByteBinary(b);
		System.out.println();
		bp.printShortBinary(s);
		System.out.println();
		bp.printIntBinary(i);
		System.out.println();
		bp.printLongBinary(l);
		System.out.println();
		System.out.println(l);
		
	}
}
