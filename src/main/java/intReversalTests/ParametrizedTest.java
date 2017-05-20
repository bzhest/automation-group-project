package intReversalTests;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Andrey on 18.05.2017.
 */
@RunWith(Parameterized.class)
public class ParametrizedTest {
    private int toReverse;
    private int expected;

    public ParametrizedTest(int toReverse, int expected) {
        this.toReverse = toReverse;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {12, 21}, {10, 1}, {123, 321}, {-1, -1}
        });
    }

    @org.junit.Test
    public void testWithParams() {
        IntReverseNew reverser = new IntReverseNew();
        Assert.assertEquals("Wrong reversed", this.expected, reverser.reversedInt(this.toReverse));
    }
}
