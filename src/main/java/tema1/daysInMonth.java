package tema1;

/*

11. Print the number of days specific to each month in year.
input: Month (string) of index of the month(1, 2, ... 12)
output: 31, 30, 28


 */

import java.util.Scanner;

public class daysInMonth {

    public static void main(String[] args) {

        byte[] monthToDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        byte month = sc.nextByte();

        System.out.println("numarul de zile din luna " + month + " este " + monthToDays[month - 1]);


    }

}
