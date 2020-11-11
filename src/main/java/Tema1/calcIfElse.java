package Tema1;

//  6. Change the implementation of the calculator from the previous meeting to use only if-else instead of switch.

import java.util.Scanner;

public class calcIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int n1 = sc.nextInt();
        System.out.println("introduceti al doilea numar:");
        int n2 = sc.nextInt();
        System.out.println("introduceti operatia dorita pentru cele doua numere");
        String operatie = sc.next();
        boolean validOperation = false;
        if (operatie.equals("+")) {
            System.out.println("Suma numerelor este " + (n1 + n2));
            validOperation = true;
        } else if (operatie.equals("-")) {
            System.out.println("Diferenta numerelor este " + (n1 - n2));
            validOperation = true;
        } else if (operatie.equals("*")) {
            System.out.println("Produsul numerelor este " + (n1 * n2));
            validOperation = true;
        } else if (operatie.equals("/")) {
            System.out.println("Partea intreaga a impartirii lui " + n1 + " la " + n2 + " este " + (n1 / n2));
            validOperation = true;
        }

        if (!validOperation)
            System.out.println("Operatie necunoscuta");


    }
}
