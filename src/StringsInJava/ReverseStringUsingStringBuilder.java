package StringsInJava;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String inputString = "";
        String output = reverseStringInPlace(inputString);
        System.out.println(inputString + " : " + output);

    }


    public static String reverseStringInPlace(String input) {

        if (input == null || input.isEmpty() || input.length() <= 1)
            return input;


        StringBuilder stringBuilder = new StringBuilder(input);

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            char tmpChar = stringBuilder.charAt(end);
            stringBuilder.setCharAt(end, stringBuilder.charAt(start));
            stringBuilder.setCharAt(start, tmpChar);

            start++;
            end--;
        }

        return stringBuilder.toString();
    }
}
