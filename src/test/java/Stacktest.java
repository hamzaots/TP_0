import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Stacktest {
    @Test
    public void push_pileisnotfull (){
        Stack s= new Stack();
        s.push(1);
        assertEquals(1,s.size());
        assertEquals(1,s.peek());
    }
    @Test
    public void push_pileisfull (){
        Stack s =new Stack();
        for (int i=0;i<10;i++){
            s.push(i);
        }
        s.push(10);
        assertEquals(11,s.size());
        assertEquals(10,s.peek());
    }
    @Test
    public void pop_pileisnotfull(){

        Stack s = new Stack();
        s.push(1);
        assertEquals(1,s.pop());
        assertEquals(0,s.size());
    }
    @Test
    public void pop_pileisfull(){
        Stack s = new Stack();
        assertEquals(Exception.class,s.pop());
    }
}
