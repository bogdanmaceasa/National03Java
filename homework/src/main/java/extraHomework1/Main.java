package extraHomework1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);


//        System.out.println("input the desired temperature in Farenheit");
//        int temp = sc.nextInt();
//        System.out.println(temp + " degree Fahrenheit is equal to " +PublicClasses.tempConverter(temp) + " in Celsius");
//
//        System.out.println("input the desired size in inch");
//        temp = sc.nextInt();
//        System.out.println(temp + " inch is " +PublicClasses.inchConverter(temp) + " meters");

//        System.out.println("Input first number: ");
//        int a = sc.nextInt();
//        System.out.println("Input second number: ");
//        int b = sc.nextInt();
//        System.out.println("Input third number: ");
//        int c = sc.nextInt();
//        System.out.println("Input fourth number: ");
//        int d = sc.nextInt();
//        if (PublicClasses.equalNumbers(a,b,c,d))
//            System.out.println(" Numbers are equal!");
//        else System.out.println(" Numbers are not equal!");


        System.out.println("Input number: ");
        int a = sc.nextInt();
        if (PublicClasses.isPosivite(a))
            System.out.println(" Number is positive ");
        else System.out.println(" Number is negative ");

    }

}
