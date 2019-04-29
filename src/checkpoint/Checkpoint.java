package checkpoint;

public class Checkpoint {
	public static void main(String[] args) {
		byte[] array = {(byte) 0b11111111, (byte) 0b10101010, 0b00000000};
		System.out.println(readBitsFromArray(array, 4, 4));
	}
	
	public static int readBitsFromArray(byte[] array, int offset, int bits) {
		int byteOffset = offset / 8;
		int bitOffset = 7 - (offset % 8);
		byte current;
		byte val = 0;
		int result = 0;
		for (int i = 0; i < bits; i++) {
			current = array[byteOffset];
			val += current & (1 << bitOffset);
			bitOffset--;
		}
		
		return val;
	}
}
