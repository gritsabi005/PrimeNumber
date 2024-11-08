package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int startNumber = 0;
        int rangedNumber = 1000;
        System.out.println("Hej, det finns "+ PrimeNumber.countHowManyAreThere(startNumber, rangedNumber)+ " primtal mellan 0 och 1000!");
        System.out.println("Och den totala summan av dessa primtal är "+ PrimeNumber.addAllSumsOfPrimeNumbers(startNumber, rangedNumber)+".");
    }
}