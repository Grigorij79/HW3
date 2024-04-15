import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SumCalculatorTest {
    private SumCalculator sumCalc;

    @BeforeEach
    public void beforeEach() {
        sumCalc = new SumCalculator();
    }

    @Test
    public void testThat1Correct() {
        int actual = sumCalc.sum(1);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThat3Correct() {
        int actual = sumCalc.sum(3);

        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThat0Correct() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumCalc.sum(0)
        );
    }

    @Test
    public void testThatNegativeInputCorrect() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumCalc.sum(-1)
        );
    }

    @Test
    public void testThatBigInputCorrect() {
        int maxN = 65536;

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumCalc.sum(maxN + 1)
        );
    }

}
