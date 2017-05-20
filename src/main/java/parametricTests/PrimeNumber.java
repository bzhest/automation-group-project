package parametricTests;

/**
 * Created by Andrey on 20.05.2017.
 */
public class PrimeNumber {
    public static Boolean isNumberPrime(final Integer number){
        for (int i = 2; i< number; i++){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer a = 11;
        System.out.println(isNumberPrime(a));
    }
}
