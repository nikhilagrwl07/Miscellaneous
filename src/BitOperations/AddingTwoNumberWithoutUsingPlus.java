package BitOperations;

/**
 * Created by nikhilagrawal on 29/08/16.
 */

public class AddingTwoNumberWithoutUsingPlus {

    public static void main(String[] args) {

        System.out.println("result :: " + Add(2, 3));
    }

    public static int Add(int x, int y) {
        // Iterate till there is no carry
        while (y != 0) {
            // carry now contains common set bits of x and y
            int carry = x & y;

            // Sum of bits of x and y where at least one of the bits is not set
            x = x ^ y;
            System.out.println("x = " + x);

            // Carry is shifted by one so that adding it to x gives the required sum
            y = carry << 1;
        }
        return x;

    }
}

