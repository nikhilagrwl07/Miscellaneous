package BitOperations;

/**
 * Created by nikhilagrawal on 29/08/16.
 */

public class BitMagic {
	
	
	public static void main(String[] args) {
		
		int x = 20, y = x;
		int count = 0;
		
		int right_most_set_bit_no = x & ~(x - 1);
		
		System.out.println("Right most= " + right_most_set_bit_no);
		
		//Time Complexity: (-)(logn) (Theta of logn)
		while (x != 0) {
			
			System.out.println("x= " + x);
			
			int z = x & 1;
			
			if (z == 1) {
				count++;
			}
			x = x >> 1;
		}
		
		System.out.println("Shift Operation: " + count);
		
		int total_ones = 0;
		
		//Time Complexity: O(logn)
		// Brian Kernighan’s Algorithm
		while (y != 0) {
			System.out.println("y= " + y);
			y = y & (y - 1);
			
			total_ones++;
		}
		System.out.println("-1 Operation: " + total_ones);
	}
}
