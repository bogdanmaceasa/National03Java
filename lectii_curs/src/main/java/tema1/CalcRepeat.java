package tema1;

//  7. Change the implementation of the calculator from the previous meeting to not stop after one calculation. (Hint: put switch inside a while loop)

import java.util.Scanner;

public class CalcRepeat {
    public static void main(String[] args) {

        boolean newCalc = true;


        while (newCalc) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number: ");
            int n1 = sc.nextInt();
            System.out.println("enter the second number: ");
            int n2 = sc.nextInt();
            System.out.println("enter the desired operation to be performed ");
            String operation = sc.next();

            switch (operation) {
                case "+":
                    System.out.println("the sum of the two numbers is " + (n1 + n2));
                    break;
                case "-":
                    System.out.println(n1 + "minus " + n2 + " is " + (n1 - n2));
                    break;
                case "*":
                    System.out.println(n1 + "times " + n2 + " is " + (n1 * n2));
                    break;
                case "/":
                    System.out.println(n1 + "divided by " + n2 + " is " + (n1 / n2));
                    break;
                default:
                    System.out.println("Unknown calculation");

            }


            System.out.println("Do you want to perform another calculation? ( y / n )");
            String cont = sc.next();

            if (!cont.equals("y"))
                newCalc = false;

        }

    }
}
