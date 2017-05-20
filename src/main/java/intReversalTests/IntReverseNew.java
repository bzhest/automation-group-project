package intReversalTests;

/**
 * Created by Andrey on 18.05.2017.
 */
public class IntReverseNew {
    public int reversedInt (int intToReverse) {
        int reverseInt ;
        String intAsString = Integer.toString(intToReverse);
        String reversedString = new StringBuilder(intAsString).reverse().toString();

        reverseInt = Integer.parseInt(reversedString);
        System.out.println("Int to reverse " + intToReverse);
        System.out.println("Int after reverse " + reverseInt);
        return reverseInt;
    }

}
