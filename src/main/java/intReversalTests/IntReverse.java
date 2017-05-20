package intReversalTests;

/**
 * Created by Andrey on 18.05.2017.
 */
public class IntReverse {
    public int reverse(int intReverse){
        char [] chars = (intReverse + "").toCharArray();
        char [] newChars = new char [chars.length];
        for (int i = 0; i< chars.length; i++) {
            newChars[i] = chars[chars.length - i];
        }
        return Integer.parseInt(new String(newChars));

    }
    }

