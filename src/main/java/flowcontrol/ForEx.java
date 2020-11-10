package flowcontrol;

public class ForEx {

    static  int classVariable = 22; // variabila statica de clasa
    int instanceVariable = 33; // variabila de instanta

    public static void main(String[] args) {

        for (int i = 0 ; i < 10 ; i++ ){ // i este in scop doar in interiorul for-ului
            System.out.println(i);


        }

        int[] array = new int[3];
        for ( int k=0; k < array.length; k++ ){
            System.out.println(array[k]);
        }

        int[][] arrayBi = new int[3][3];
        for ( int k=0; k < arrayBi.length; k++ ){
            //System.out.println(array[k]);
            for ( int l=0; l < arrayBi[k].length; l++ ){
                arrayBi[l][k]= l+k;
                System.out.print(arrayBi[l][k] + " ");

            }
            System.out.println();
        }
    }

}
