package Teme;

public class publicMethods {

    /**
     * Calculates if testNumber is Prime
     * @param testNumber - type integer
     * @return true if testNumber is Prime / false if testNumber is not Prime
     */
    public static boolean isPrime(int testNumber){

        boolean isPrime=true;
        if (testNumber%2==0){
            return false;
        }else {
            for (int i = 3; i <= (testNumber / 2); i++) {
                if ((testNumber % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * Calculates if testNumber is Prime
     * @param a,b - operation parameters ; op - type of operation you want to compute for a and b
     */

    public static void calculator(int a, int b, String op ){


        switch (op) {
            case "+":
                System.out.println("Suma numerelor este " + (a + b));
                return;
            case "-":
                System.out.println("Diferenta numerelor este " + (a - b));
                return;
            case "*":
                System.out.println("Produsul numerelor este " + (a * b));
                return;
            case "/":
                System.out.println("Partea intreaga a impartirii lui " + a + " la " + b + " este " + (a / b));
                return;
            default:
                System.out.println("Operatie necunoscuta");

        }
    }


    public static boolean isSquare(int[][] array){

        int arrayDepth=0;

        for ( int[] i : array ){
            arrayDepth++; // calculates the number of arrays in the bidimensional array ( depth of the array )
        }

        for ( int[] i : array ) {
            int arrayLength=0;
            for ( int j : i ){
                arrayLength++; // calculates the length of each array on each level
            }
            if (arrayDepth!=arrayLength)
                return false; // for each level of the array, if the length of the level is not the depth of the array => returns false
        }

        return true; // if the previous conditions never return false, the array is square
    }


}
