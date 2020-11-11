package tema1;

//  8. Calculate and display the factorial of a given number n. (ex: 4! = 1*2*3*4)

import java.util.Scanner;

public class factN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti un numar:");
        int n1 = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n1; i++) {
            fact *= i;
        }
        System.out.println(n1 + " factorial este: " + fact);


    }
}
