import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class FactoriallTest {
    @Test
    public void testT(){
        long ackyual = new Factorial().calc(0);
        Assertions.assertEquals(1,ackyual);
    }
    @Test
    public void testTT(){
        Assertions.assertEquals(2,new Factorial().calc(2));
    }
}
