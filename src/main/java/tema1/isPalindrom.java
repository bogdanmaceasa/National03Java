package tema1;

// 4. Check if a number is palindrom ( e.g palindrom 1221, 34143), read the number from keyboard.


import java.util.Scanner;

public class isPalindrom {

    public static void main(String[] args) {

        Scanner myNumber = new Scanner(System.in);
        System.out.println("introduceti un numar");
        int num = myNumber.nextInt();
        int number, number2 = num;
        int length = 0;

/*
    VARIANTA 1
    ==================================================================================================================

 */


//      aflam lungimea numarului
//
//        while (num >= 1) {
//            num /= 10;
//            length++;
//        }
//
////      declaram un array de lungimnea numarului introdus pe care il populam cu fiecare cifra a acestuia
//
//        int[] numArray = new int[length];
//        int i = 0;
//        while (number >= 1) {
//            numArray[i] = number % 10;
//            number /= 10;
//            i++;
//        }
//
////      declaram o variabila booleana true, aceasta va fi falsa doar in cazul in care numarul nu este palindrom
//
//        boolean isPalindrom = true;
//
//        for (int j = 0; j <= (length / 2); j++) {
//            if (numArray[j] != numArray[length - j - 1]) {
//                isPalindrom = false;
//                System.out.println("numarul nu este palindrom");
//                break;
//            }
//        }
//        if (isPalindrom) {
//            System.out.println("numarul este palindrom");
//        }

/*
    VARIANTA 2
    ==================================================================================================================

 */
        int reverseNumber = 0;
        while (number2 >= 1) {
            reverseNumber = reverseNumber * 10 + number2 % 10;
            number2 /= 10;

        }
        if (reverseNumber == num)
            System.out.println("numarul este palindrom");
        else System.out.println("numarul nu este palindrom");


    }
}
