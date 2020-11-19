package objects.inheritance;

public class Shape extends AbstractShape{

    private  String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("Shape has been drawn");

    }


}
