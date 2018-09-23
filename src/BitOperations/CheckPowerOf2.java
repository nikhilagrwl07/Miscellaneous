package BitOperations;

/**
 * Created by nikhilagrawal on 29/08/16.
 */
public class CheckPowerOf2 {
	
	public static void main(String[] args) {
		
		int x = 15;
		
		System.out.println("Number = " + x + " is power of 2 :: " + isNumberPowerOf2(x));
		System.out.println("Number = " + x + " is power of 2 :: " + isNumberPowerOf2Method2(x));
		
	}
	
	
	public static boolean isNumberPowerOf2(int x) {
		if (x < 0 || x == 0)
			return false;
		
		
		return ((x & -x) == x);
		
	}
	
	public static boolean isNumberPowerOf2Method2(int x) {
		if (x < 0 || x == 0)
			return false;
		
		
		return ((x & (x - 1)) == 0);
		
	}
	
	
	
}

