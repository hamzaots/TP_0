import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void nisnegative(){
        int result = Factorial.factorial(-1);
        assertEquals(Exception.class,result);
    }
    @Test
    public void nispositive(){
        int result = Fibonacci.fibonacci(4);
        assertEquals(24,result);
    }
}
