package objects.innerclasses;

public class OuterClass {

    static class StaticInnerMemberClass {

        public StaticInnerMemberClass(){

        }

        String concatenateTwoStrings( String a, String b){
            return a+b;
        }

    }

    abstract class InnerMemberClass {

        public InnerMemberClass(){

        }
    }
}
