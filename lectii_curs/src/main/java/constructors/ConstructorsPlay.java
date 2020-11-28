package constructors;

public class ConstructorsPlay {

    public static void main(String[] args) {

        Car carReferenceDefaultFieldValues = new Car();
        Car carReferenceExplicitInitialValues = new Car("Buggie", 250, 200, 5);

        System.out.println(carReferenceDefaultFieldValues.toString()); //   Car{nameInstanceVariable='null', speedInstanceVariable=0, numberOfHorsePowerIntstanceVariable=0}
        System.out.println(carReferenceExplicitInitialValues); // Car{nameInstanceVariable='Buggie', speedInstanceVariable=250, numberOfHorsePowerIntstanceVariable=200}\

        // toString este o metoda implicit apelata pentru fiecare obiect printat


        Dacia logan = new Dacia ();
        Dacia loganWithGPL = new Dacia (true);


    }

}
