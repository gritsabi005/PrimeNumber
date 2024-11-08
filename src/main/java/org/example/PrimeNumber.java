package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static boolean testThisNumber(int isItPrimeNumber) {
        boolean itsPrimeNumber = true;
        int itsIntegerYall;
        double itsDoubleYall;
        /*if (isItPrimeNumber % 1 == 0 && isItPrimeNumber % isItPrimeNumber == 0){
            itIsPrimeNumber = true;
        } else {
            return itIsPrimeNumber = false;
        }*/
        if (isItPrimeNumber < 2){
            return itsPrimeNumber = false;
        }
        // for example 4, it will give us 2, and 3. already in 2 that means if 4 % 2 == 0 then 4 is already out,
        // it's not prime.
        // however with 7, we will have 2, 3, 4, 5, 6 and none of these numbers can even the result of 7 divided by them,
        // so 7 does not fulfill the first loop and therefore succeeded into ended up in the "itsPrimeNumber" being true
        for (int i = 2; i < isItPrimeNumber; i++){
            if (isItPrimeNumber % i == 0){
                return itsPrimeNumber = false;
            }
        }
        return itsPrimeNumber;
    }

    public static List<Integer> testWithinThisRange(int primeNumber1, int primeNumber2) {
        List<Integer> allPrimeNumbersAreHere = new ArrayList<>();
        /*if (primeNumber1 < 2 || primeNumber2 < 2){
            // use exception
            throw new IllegalArgumentException("Range start must be at least from 2 upwards");
        }*/
        for (int i = 2; i <= primeNumber2; i ++){
            //int j; // controller since we are not using boolean
            boolean prime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                allPrimeNumbersAreHere.add(i);
            }
        }
        return allPrimeNumbersAreHere;
    }

    public static int addAllSumsOfPrimeNumbers(int startNumber, int rangedNumber) {
        List<Integer> allPrimeNumbers = testWithinThisRange(startNumber, rangedNumber);
        int sum = 0;
        for (int number : allPrimeNumbers){
            sum += number;
        }
        return sum;
    }

    public static int countHowManyAreThere(int startNumber, int rangedNumber) {
        List <Integer> allPrimeNumbers = testWithinThisRange(startNumber, rangedNumber);
        int sum = 0;
        for (int number : allPrimeNumbers){
            sum +=1;
        }
        return sum;
    }
}
