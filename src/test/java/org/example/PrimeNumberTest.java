package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @DisplayName("Test Multiple Prime Numbers")
    @ParameterizedTest
    @CsvSource({"3", "7"})
    public void testTheseNumbers(int isItPrimeNumber){
        assertEquals(true, PrimeNumber.testThisNumber(isItPrimeNumber));
    }

    @Test
    @DisplayName("Test to get all Prime Numbers within the Desired Range")
    public void testOnlyWithinThisRange(){
        int startNumber = 1;
        int rangedNumber = 30;
        List<Integer> expectedResults = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        assertEquals(expectedResults, PrimeNumber.testWithinThisRange(startNumber, rangedNumber));
    }

    @Test
    @DisplayName("Test to see how many prime numbers are there within the Desired Range")
    public void howManyAreThereWithinThisRange(){
        int startNumber = 1;
        int rangedNumber = 30;
        assertEquals(10, PrimeNumber.countHowManyAreThere(startNumber, rangedNumber));
    }

    @Test
    @DisplayName("Sum amount of all prime numbers within the desired range")
    public void sumAllPrimeNumbersWithinThisRange(){
        int startNumber = 1;
        int rangedNumber = 30;
        assertEquals(129, PrimeNumber.addAllSumsOfPrimeNumbers(startNumber, rangedNumber));
    }
}