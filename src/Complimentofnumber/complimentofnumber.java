package Complimentofnumber;

/**
 * Created by nikhilagrawal on 29/08/16.
 */


public class complimentofnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number=20;

//        int complmenetedNumber = nonLeadingZeroComplement(number);
        System.out.println("complmenetedNumber :: " + integerComplement(number));
    }

    private static int integerComplement(int n){

        String binaryString = Integer.toBinaryString(n);

        System.out.println("binaryString :: " + binaryString);
        String temp = "";
        for(char c: binaryString.toCharArray()){
            if(c == '1'){
                temp += "0";
            }
            else{
                temp += "1";
            }
        }
        int base = 2;
        int complement = Integer.parseInt(temp, base);

        return complement;
    }

    private static int nonLeadingZeroComplement(int i) {
        int ones = (Integer.highestOneBit(i) << 1) - 1;
        //System.out.println("one :: " + ones);
        return i ^ ones;
    }

}
