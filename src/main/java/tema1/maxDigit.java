package tema1;

//   3. Display the max digit from a number, read the number from keyboard.

import java.util.Scanner;


public class maxDigit {

    public static void main(String[] args) {


        Scanner myNumber = new Scanner(System.in);
        System.out.println("introduceti un numar de mai multe cifre");
        int number = myNumber.nextInt();
        int maxDigit = Integer.MIN_VALUE;

        while (number >= 1) {
            maxDigit = maxDigit > number % 10 ? maxDigit : number % 10;
            number /= 10;
        }

        System.out.println("cea mai mare cifra a numarului introdus este " + maxDigit);

    }

}
