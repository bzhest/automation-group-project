package parametricTests;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Andrey on 20.05.2017.
 */
public class paramtricTestWithDataProvider {
    private PrimeNumber primeNumber;

    @BeforeMethod
    public void initialize(){
        primeNumber = new PrimeNumber();
    }

    @DataProvider (name = "test1")
    public static Object[][] primeNumbers(){
        return new Object[][]{{2,true}, {3,true}, {4,true}, {5,true}, {6, true}, {7,true}};
    }

    @Test(dataProvider = "test1")
    public void testPrimeNumbersValidator(Integer input, Boolean expected){
        System.out.println(input + " " + expected);
        Assert.assertEquals(expected, PrimeNumber.isNumberPrime(input));
    }
}
