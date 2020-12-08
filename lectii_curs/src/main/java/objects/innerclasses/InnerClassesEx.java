package objects.innerclasses;

public class InnerClassesEx {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };

        r1.run();
//        r1.runFast(); // not found because it is not in the interface used in Runnable.

        OuterClass.StaticInnerMemberClass innerMemberClass = new OuterClass.StaticInnerMemberClass();
        innerMemberClass.concatenateTwoStrings("a", "b");

    }
}

