import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonnacciTest {
    @Test
    public void testnisinf0(){
        int result=Fibonacci.fibonacci(0);
        assertEquals(Exception.class, result);
    }
    @Test
    public void testnisnull(){
        int result=Fibonacci.fibonacci(0);
        assertEquals(0, result);
    }
    @Test
    public void testnisequal1(){
        int result=Fibonacci.fibonacci(1);
        assertEquals(1, result);
    }
    @Test
    public void elseall(){
        int result=Fibonacci.fibonacci(2);
        assertEquals(1, result);
    }
}
