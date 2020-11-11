package tema1;

// 2. Display the smallest number from an array of numbers (2 versions: with normal for and with foreach)

import java.util.Scanner;

import static java.lang.Integer.min;

public class smallestNumber {

    public static void main(String[] args) {
/*
        VARIANTA 1
        =========================================================
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("numarul de elemente ale sirului");
        int leng = sc.nextInt();
        int[] arrayIn = new int[leng];
        System.out.println("elementele sirului");
        for (int j = 0; j < leng; j++) {
            arrayIn[j] = sc.nextInt();
        }

        int minNum = Integer.MAX_VALUE;

        for (int j : arrayIn) {
            minNum = min(j, minNum);
        }

        System.out.println("numarul cel mai mic din lista este: " + minNum);

/*
        VARIANTA 2
        ==========================================================
*/


        for (int i = 0; i < leng; i++) {
            minNum = (minNum > arrayIn[i]) ? arrayIn[i] : minNum;
        }
        System.out.println("numarul cel mai mic din lista este: " + minNum);


    }

}
