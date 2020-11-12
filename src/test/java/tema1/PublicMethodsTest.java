package tema1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublicMethodsTest {

    @Test
    public void firstTest() {
        boolean testPrime = PublicMethods.isPrime( 10 );
        assertEquals("comment", true, testPrime );
    }

    @Test
    public void secondTest() {
        boolean testPrime = PublicMethods.isPrime( 11 );
        assertEquals("comment", true, testPrime );
    }

    @Test

}
