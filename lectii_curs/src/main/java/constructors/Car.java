package constructors;

public class Car {

    private String nameInstanceVariable;
    private int speedInstanceVariable;
    private int numberOfHorsePowerIntstanceVariable;
    private final int numberOfWheels;


    public Car() {
    }

    public Car(String nameMethodParameter, int speed, int hp, int wheels ) {

        this.nameInstanceVariable = nameMethodParameter;
        this.speedInstanceVariable = speed;
        this.numberOfHorsePowerIntstanceVariable = hp;
        this.numberOfWheels = wheels;

    }

    public void setNameInstanceVariable(String nameInstanceVariable) {
        this.nameInstanceVariable = nameInstanceVariable;
    }

    public void setSpeedInstanceVariable(int speedInstanceVariable) {
        this.speedInstanceVariable = speedInstanceVariable;
    }

    public void setNumberOfHorsePowerIntstanceVariable(int numberOfHorsePowerIntstanceVariable) {
        this.numberOfHorsePowerIntstanceVariable = numberOfHorsePowerIntstanceVariable;
    }

//    public void setnumberOfWheels(int numberOfWheels) {
//        this.numberOfWheels = numberOfWheels;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "nameInstanceVariable='" + nameInstanceVariable + '\'' +
                ", speedInstanceVariable=" + speedInstanceVariable +
                ", numberOfHorsePowerIntstanceVariable=" + numberOfHorsePowerIntstanceVariable +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
