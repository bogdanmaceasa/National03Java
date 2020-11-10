package flowcontrol;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduceti un numer intreg");
        int numar= sc.nextInt();

// IF ARE NEVOIE DE O CONDITIE BOOLEANA!
// IF ARE NEVOIE DE O CONDITIE BOOLEANA!
// IF ARE NEVOIE DE O CONDITIE BOOLEANA!

        if ( isEven(numar) ){
        System.out.println("numarul " + numar + " este par");
    } else if (numar % 2== 1){
        System.out.println("numarul " + numar + " este impar");
    }

    }

    /**
     * @author nick
     *
     * @param n numarul intreg
     *
     * @return true if n is even
     */
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
}
