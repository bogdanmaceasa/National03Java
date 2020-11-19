package objects.aggregation;

public class Car {

    private String name;
    private int speed;
    private Engine benzina;

    public void start() {
        System.out.println("Car started");
        System.out.println(".........");
        System.out.println("Coughs out some fuel :S :O");
        System.out.println(".........");
        System.out.println("Eventually...");
        benzina.start();
    }

    public Car() {
        // constructor fara initializare
    }

    public Car(Engine benzina) {
        this.benzina = benzina;
        // constructor cu initializare
    }
}
