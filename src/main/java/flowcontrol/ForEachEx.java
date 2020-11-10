package flowcontrol;

import java.util.Arrays;

public class ForEachEx {

    static  int classVariable = 22; // variabila statica de clasa
    int instanceVariable = 33; // variabila de instanta

    public static void main(String[] args) {
        int[] array = new int[3];
        for ( int i : array ) {
            System.out.println(i);
            // valoarea fiecarui element se inializeaza by default cu 0

        }

        int[][] arrayBi = new int[3][3];
        for ( int[] i : arrayBi ) {
            System.out.println(i);

            // array-urile i vor fi NULL

        }
        int[][] arrayBiNesimetric = new int[3][];
        arrayBiNesimetric[0] = new int[2];
        arrayBiNesimetric[1] = new int[1];
        arrayBiNesimetric[2] = new int[2];
        for ( int[] arrayFromArray : arrayBiNesimetric ) {
            System.out.println(Arrays.toString(arrayFromArray));
//            for ( int i: arrayFromArray ) {
//                System.out.println(arrayFromArray[i] + " , ");

            }
        }



    }

