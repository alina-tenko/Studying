package com.company;

public class FizzBuzz {

    public static void main(String[] args) {
        //comment

        for (int value = 1; value <= 100; value++) {

            if (isFizzBuzz(value)) {
                print("FizzBuzz is Fun!!!");
            } else if (isFizz(value)) {
                print("Fizz");
            } else if (isBuzz(value)) {
                print("Buzz");
            } else {
                print(String.valueOf(value));
            }

        }

    }

    private static void print(String string) {
        System.out.println(string);
    }

    private static boolean isBuzz(int value) {
        return value % 5 == 0;
    }

    private static boolean isFizz(int value) {
        return value % 3 == 0;
    }

    private static boolean isFizzBuzz(int value) {
        return value % 3 == 0 && value % 5 == 0;
    }

}
//
//Write a program that prints the numbers from 1 to 100.
// But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
// For numbers which are multiples of both three and five print "FizzBuzz".
