package objects.composition;

public class Heart {

    int beats;
    int bloodPressure;

    public Heart(int beats, int bloodPressure) {
        this.beats = beats;
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "beats=" + beats +
                ", bloodPressure=" + bloodPressure +
                '}';
    }
}
