package Teme;

// 1. Calculate the sum of the first 100 prime numbers.

import java.util.Scanner;

public class sumPrime100 {

    public static void main(String[] args) {

        int index = 2;
        int  i = 3;

        System.out.print("the first 100 prime numbers are:");
        System.out.println();
        System.out.println(1);
        System.out.println(2);
        int sum = 3;

        while ( index < 100 ) {
            if (publicMethods.isPrime(i)){
                index++;
                sum+=i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("the sum for the first 100 prime numbers is: " + sum);
    }


}



