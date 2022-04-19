package open.bruveris.arturs.uzdevums;
import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
    @Test
    public void sumTest() {
        Assert.assertEquals(3, calculator.sum(1,2));
    }

    @Test
    public void subTest() {
        Assert.assertEquals(3, calculator.sub(6,3));
    }

    @Test
    public void multTest() {
        Assert.assertEquals(3, calculator.multiply(1,3));
    }

    @Test
    public void divTest() {
        Assert.assertEquals(3, calculator.div(9,3));
    }
}
