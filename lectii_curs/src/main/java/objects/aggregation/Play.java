package objects.aggregation;

public class Play {

    public static void main(String[] args) {
        Engine v8TwinTurbo = new Engine();
        Car fordFocus = new Car(v8TwinTurbo);
        Car daciaLogan = new Car(v8TwinTurbo);
        Car vwGolf = new Car(v8TwinTurbo);
        Car opelAstra = new Car(v8TwinTurbo);
        System.out.println(fordFocus);
        System.out.println(daciaLogan);
        System.out.println(vwGolf);
        System.out.println(opelAstra);
        fordFocus.start();
        System.out.println();
        v8TwinTurbo.start();


    }

}
