import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeTest {
    @Test
    public void nisinf2(){
        boolean result = Prime.isPrime(1);
        assertEquals(false,result);
    }
    @Test
    public void nisup2andisprime(){
        boolean result = Prime.isPrime(3);
        assertEquals(true,result);
    }
    @Test
    public void nisup2andisnotprime(){
        boolean result = Prime.isPrime(6);
        assertEquals(false,result);
    }
}
