package objects.composition;

public class Human {

    private Heart heart;

    public Human() {
        this.heart = new Heart(85,1260);
    }

    public Heart getHeart() {
        return heart;
    }

    @Override
    public String toString() {
        return "Human{" +
                "heart=" + heart +
                '}';
    }
}


