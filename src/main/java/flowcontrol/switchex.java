package flowcontrol;

//import java.sql.SQLOutput;
import java.util.Scanner;

public class switchex {

    public static void main(String[] args) {
//        String express= "2";
//        switch(args[0]){
//            // args controleaza inputurile metodei main - pe care o controlezi din Edit configuration -> Program arguments )
//            case "1":
//                System.out.println("argumentul este 1");
//                break;
//            case "2":
//                System.out.println("argumentul este 2");
//                break;
//            default:
//                System.out.println("argumentul este altul");
//                // default nu este musai sa fie ultimul in switch -> poate fi si la inceput
//                // daca nu este pus ultimul in switch este musai sa aiba si break la sfarsit
//

        Scanner sc= new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int n1 = sc.nextInt();
        System.out.println("introduceti al doilea numar:");
        int n2= sc.nextInt();

        System.out.println("introduceti operatia dorita pentru cele doua numere");
        String operatie = sc.next();
        final String case1= "+";
        switch(operatie){
            // case permite folosirea unei variabile doar daca este de tip constant.
            case case1:
                System.out.println("Suma numerelor este " + (n1+n2));
                break;
            case "-":
                System.out.println("Diferenta numerelor este " + (n1-n2));
                break;
            case "*":
                System.out.println("Produsul numerelor este " + (n1*n2));
                break;
            case "/":
                System.out.println( n1 + " Impartit la " + n2 + " este" + (n1/n2));
                break;
            default:
                System.out.println("Operatie necunoscuta");

        }
    }
}
