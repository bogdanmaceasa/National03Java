package primitive;





//////////////////////////////////////////////////////////////////////////////
//                              TEMA 1                                      //
//                                                                          //
//Implement in java the following algorithms:                               //
//                                                                          //
//1. Calculate the sum of the first 100 numbers higher than 0               //
//                                                                          //
//2. Display the smallest number from an array of number                    //
//                                                                          //
//3. Display the max digit from a number.                                   //
//                                                                          //
//4. Check if a number is palindrom( e.g palindrom 1221, 34143)             //
//                                                                          //
//5. Display all the prime numbers lower than a given number                //
//////////////////////////////////////////////////////////////////////////////




import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import static java.lang.Math.*;

public class numberCalculations {
    public static void main(String[] args) {



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


////     1) Sum of number >0 <100

//        int sumNumere=0;
//        for(int i=1;i<100;i++) {
//            sumNumere += i;
//        }
//        System.out.println("suma numerelor pozitive mai mici decat 100 este: "+ sumNumere);
//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//      2) Find the smallest number in an array of numbers

//        VARIANTA 1
//        =========================================================
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("numarul de elemente ale sirului");
//        int leng = sc.nextInt();
//        int[] arrayIn = new int[leng];
//        System.out.println("elementele sirului");
//        for( int j = 0; j<leng; j++){
//            arrayIn[j]= sc.nextInt();
//        }
//        int minNum = Integer.MAX_VALUE;
//        for (int j : arrayIn) {
//            minNum = min(j, minNum);
//        }
//        System.out.println();
//        System.out.println("numarul cel mai mic din lista este: "+ minNum);
//

//        VARIANTA 2
//        ==========================================================
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("numarul de elemente ale sirului");
//        int leng = sc.nextInt();
//        int[] arrayIn = new int[leng];
//        System.out.println("elementele sirului");
//        for( int j = 0; j<leng; j++){
//            arrayIn[j]= sc.nextInt();
//        }
//        int minNum = Integer.MAX_VALUE;
//        for (int j : arrayIn) {
//            if (minNum > j){
//                minNum=j;
//            }
//        }
//        System.out.println("numarul cel mai mic din lista este: "+ minNum);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//      3) Display the biggest digit from a number

////
//        Scanner myNumber= new Scanner(System.in);
//        System.out.println("introduceti un numar de mai multe cifre");
//        int number=myNumber.nextInt();
//        int maxDigit = Integer.MIN_VALUE;
//
//
////      VARIANTA 1
////      ===========================================================
//        while(number>=1){
//            maxDigit= max(maxDigit,number%10);
//            number/=10;
//
//        }
//
//      VARIANTA 2
//      ===========================================================
//        while(number>=1){
//            maxDigit = maxDigit > number%10 ? maxDigit : number%10;
//            number/=10;
//        }
//
//        System.out.println("cea mai mare cifra a numarului introdus este " + maxDigit);
////

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


////      4) Check if a number is a pallindrom
//
//        Scanner myNumber= new Scanner(System.in);
//        System.out.println("introduceti un numar");
//        int num=myNumber.nextInt();
//        int number=num;
//        int length=0;
//
////      aflam lungimea numarului
//
//        while (num>=1) {
//            num/=10;
//            length++;
//        }
//
////      declaram un array de lungimnea numarului introdus pe care il populam cu fiecare cifra a acestuia
//
//        int[] numArray =new int[length];
//        int i=0;
//        while (number>=1) {
//            numArray[i]=number%10;
//            number/=10;
//            i++;
//        }
//
////      declaram o variabila booleana true, aceasta va fi falsa doar in cazul in care numarul nu este palindrom
//
//        boolean isPalindrom=true;
//
//        for (int j=0; j<=(length/2); j++) {
//            if (numArray[j] != numArray[length - j - 1]) {
//                isPalindrom = false;
//                System.out.println("numarul nu este palindrom");
//                break;
//            }
//        }
//        if (isPalindrom) {
//            System.out.println("numarul este palindrom");
//        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//      5) Display all prime numbers lower than a given number
//
//        Scanner myNumber= new Scanner(System.in);
//        System.out.println("introduceti un numar");
//        int num=myNumber.nextInt();
//        boolean isPrime=true;
//        if (num%2==0){
//            System.out.println("numarul nu este prim");
//        }else {
//            for (int i = 3; i <= (num / 2); i++) {
//                if (((i / 2) > 1) && ((i % 2) != 0)) {
//                    System.out.println(i);
//                    if ((num % i) == 0) {
//                        System.out.println("numarul nu este prim");
//                        isPrime=false;
//                        break;
//                    }
//                }
//            }
//        }
//        if (isPrime){
//            System.out.println("numarul este prim");
//        }


//        VARIANTA 1

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        Scanner myNumber= new Scanner(System.in);
//        System.out.println("introduceti un numar");
//        int num=myNumber.nextInt();
//
//
//        int[] primeArray= new int[];
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
//        for (int m=k; m>=0; m--) {
//            System.out.printf("\n");
//            System.out.print(primeArray[m]);
//        }
//


//        VARIANTA 2

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//        Scanner myNumber= new Scanner(System.in);
//        System.out.println("introduceti un numar mai mare decat 2");
//        int num=myNumber.nextInt();
//
//
//        int[] primeArray= new int[];
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
//        for (int m=index; m>=0; m--) {
//            System.out.print("\n");
//            System.out.print(primeArray[m]);
//        }


    }
}