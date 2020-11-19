package objects.inheritance;

import java.util.AbstractCollection;

public class PlayWithShapes {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Shape circleShape = new Circle();
        Shape shape = new Shape();
        Shape form = new Square();
        AbstractShape abstractShape = new Circle();

//        Circle c1 = new Shape(); bad
        System.out.println(circle.getColor());
        circle.draw();
        circleShape.draw();
        abstractShape.draw();

        AbstractShape [] shapes = new AbstractShape[4];
        shapes[0]=circle;
        shapes[1]=circleShape;
        shapes[2]=abstractShape;
        shapes[3]=form;

        System.out.println("before the for");
        for (AbstractShape abstractShape1: shapes ){
            System.out.println(abstractShape1 instanceof Circle);
            System.out.println(abstractShape1 instanceof Shape);
            abstractShape1.draw();
        }

    }

}
