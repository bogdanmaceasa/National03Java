package constructors;

public class Dacia extends Car{


    private boolean hasGPL;
    private final String sizeInstanceVariable = "SUV";

    public Dacia() {
        super("Logan", 100, 175, 5);

    }

    public Dacia(boolean hasGPL) {
        this.hasGPL = hasGPL;
    }

    @Override
    public String toString() {
        return "Dacia{" +
                "sizeInstanceVariable='" + sizeInstanceVariable + '\'' +
                '}';
    }
}
