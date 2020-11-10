package flowcontrol;

import java.util.Scanner;

public class whileEx {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int n1 = sc.nextInt();

        while ( n1 != 0){
            int ultima_cifra= n1%10;
            if ( ifelse.isEven(ultima_cifra) ){
                System.out.println("numarul " + ultima_cifra + " este par");
            } else {
                System.out.println("numarul " + ultima_cifra + " este impar");
            }
            n1=n1/10;
        }


    }
}
