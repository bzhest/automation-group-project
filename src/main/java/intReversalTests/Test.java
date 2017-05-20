package intReversalTests;

/**
 * Created by Andrey on 18.05.2017.
 */
public class Test {


    public static void main(String[] args) {
        int i = 123;
        IntReverse ir = new IntReverse();
        IntReverseNew irn = new IntReverseNew();
        //irn.reversedInt(i);

        System.out.println(ir.reverse(i));

    }
}
