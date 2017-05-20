package intReversalTests;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andrey on 18.05.2017.
 */
@RunWith(Parameterized.class)
public class ReverseTests {
    int valueToTest;
    int expectedValueAfterReverse;
    int reversedInt;
    IntReverseNew reverser;

    @Before
    public void setUp() {
        reverser = new IntReverseNew();

    }

    @Test
    public void basicTest() {
        verify(10, 1);
    }

    @Test
    public void valueWithZero() {
        final int valueToTest = 10;
        final int expectedValueAfterReverse = 1;
        reversedInt = reverser.reversedInt(valueToTest);
        assertEquals("value reversed not propery. Expected = " + expectedValueAfterReverse + ", but was" + reversedInt, reversedInt, expectedValueAfterReverse);

    }

    @Test(expected = NumberFormatException.class)
    public void maxIntValue() {
        final int valueToTest = 2147483647;
        final int expectedValueAfterReverse = 2147483647;
        reversedInt = reverser.reversedInt(valueToTest);
        assertEquals("value reversed not propery. Expected = " + expectedValueAfterReverse + ", but was" + reversedInt, reversedInt, expectedValueAfterReverse);

    }

    @Ignore
    @Test(timeout = 2000)
    public void longTimedTest() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("method was interrupted");
        }
    }

    private void verify(int act, int exp) {
        valueToTest = act;
        expectedValueAfterReverse = exp;
        reversedInt = reverser.reversedInt(valueToTest);
        assertEquals("value reversed not propery", reversedInt, expectedValueAfterReverse);
    }




    @After
    public void tearDown() {
        System.out.println("Robot works");
    }

}
