package objects.composition;

public class PlayHuman {

    public static void main(String[] args) {
        Human human4 = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        System.out.println(human1.getHeart());
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);

    }

}
