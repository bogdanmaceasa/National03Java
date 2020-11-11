package Tema1;

//  7. Change the implementation of the calculator from the previous meeting to not stop after one calculation. (Hint: put switch inside a while loop)

import java.util.Scanner;

public class calcRepeat {
    public static void main(String[] args) {

        boolean continuati = true;


        while (continuati) {

            Scanner sc = new Scanner(System.in);
            System.out.println("introduceti primul numar:");
            int n1 = sc.nextInt();
            System.out.println("introduceti al doilea numar:");
            int n2 = sc.nextInt();
            System.out.println("introduceti operatia dorita pentru cele doua numere");
            String operatie = sc.next();

            switch (operatie) {
                case "+":
                    System.out.println("Suma numerelor este " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("Diferenta numerelor este " + (n1 - n2));
                    break;
                case "*":
                    System.out.println("Produsul numerelor este " + (n1 * n2));
                    break;
                case "/":
                    System.out.println("Partea intreaga a impartirii lui " + n1 + " la " + n2 + " este " + (n1 / n2));
                    break;
                default:
                    System.out.println("Operatie necunoscuta");

            }

//          publicMethods.calculator(n1,n2,operatie);

            System.out.println("Doriti sa faceti o alta operatie? ( y / n )");
            String cont = sc.next();

            if ( !cont.equals("y"))
                continuati = false ;

        }

    }
}
