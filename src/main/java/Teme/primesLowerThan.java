package Teme;

// 5. Display all the prime numbers lower than a given number, read the number from keyboard


import java.util.Scanner;

public class primesLowerThan {

    public static void main(String[] args) {

/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        VARIANTA 1

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/


//        Scanner myNumber= new Scanner(System.in);
//        System.out.println("introduceti un numar");
//        int num=myNumber.nextInt();
//
//
//        int[] primeArray= new int[num/2];
//        primeArray[0]=1;
//        primeArray[1]=2;
//        int k=1;
//
//
//
//        for (int i=3; i<=num; i++){
//            if (i%2==0){
//                continue;
//            }else {
//                boolean isPrime=true;
//                for (int j = 3; j <= (i / 2); j++) {
//                    if (((j / 2) > 1) && ((j % 2) == 0)) {
//                        continue;
//                    }
//                    if ((i % j) == 0) {
//                        isPrime=false;
//                        break;
//                        }
//                    }
//                if (isPrime){
//                    k++;
//                    primeArray[k]=i;
//                }
//            }
//
//            }
//        System.out.printf("numerele prime mai mici decat "+ num + " sunt");
//
//        for (int m=k; m>=0; m--)
//            System.out.print("\n" + primeArray[m]);
//
//


/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        VARIANTA 2

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/

//
//
//
//        Scanner myNumber= new Scanner(System.in);
//        System.out.println("introduceti un numar mai mare decat 2");
//        int num=myNumber.nextInt();
//
//
//        int[] primeArray= new int[num/2];
//        primeArray[0]=1;
//        primeArray[1]=2;
//        int index=1;
//
//        for (int i = 3; i < num; i++) {
//            boolean prime=true;
//            for (int j=1; j<=index; j++) {
//                if ((i%primeArray[j])==0){
//                   prime=false;
//                }
//            }
//
//            if (prime){
//                index++;
//                primeArray[index]=i;
//            }
//        }
//
//        System.out.print("numerele prime mai mici decat "+ num + " sunt");
//
//        for (int m=index; m>=0; m--)
//            System.out.print("\n" + primeArray[m]);




/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        VARIANTA 3

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/


        Scanner myNumber= new Scanner(System.in);
        System.out.println("introduceti un numar mai mare decat 2");
        int num=myNumber.nextInt();

        int[] primeArray= new int[num/2];
        primeArray[0]=1;
        primeArray[1]=2;
        int index=1;

        for (int i = 3; i < num; i++) {
            if (publicMethods.isPrime(i)) {
                index++;
                primeArray[index]=i;
            }
        }

        System.out.print("numerele prime mai mici decat "+ num + " sunt");

        for (int m=index; m>=0; m--)
            System.out.print("\n" + primeArray[m]);


    }
}
