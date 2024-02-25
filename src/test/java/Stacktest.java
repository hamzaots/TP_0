import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Stacktest {
    //si la pile n'est pas pleine
    @Test
    public void pushtest1 (){
        Stack s= new Stack();
        s.push(1);
        assertEquals(1,s.size());
        assertEquals(1,s.peek());
    }
    @Test
    //si la pile est pleine
    public void pushtest2 (){
        Stack s =new Stack();
        for (int i=0;i<10;i++){
            s.push(i);
        }
        s.push(10);
        assertEquals(11,s.size());
        assertEquals(10,s.peek());
    }
    @Test
    //si la pile n'est pas vide
    public void poptest1(){

        Stack s = new Stack();
        s.push(1);
        assertEquals(1,s.pop());
        assertEquals(0,s.size());
    }
    @Test
    //si la pile est vide
    public void poptest2(){
        Stack s = new Stack();
        assertEquals(Exception.class,s.pop());
    }
}
