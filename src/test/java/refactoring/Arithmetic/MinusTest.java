package refactoring.Arithmetic;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MinusTest {

    @Test
    @Parameters(method = "testRequestLoan_Parameters")
    public void calculate(int a, int b, int result) {

        Minus minus = new Minus();
        int calculate = minus.calculate(a, b);

        Assert.assertEquals(result, calculate);

    }

    @SuppressWarnings("unused")
    private static Object[][] testRequestLoan_Parameters() {
        return new Object[][]{
                {6, 3, 3},
                {9, 10, -1},
                {50, 6, 44}
        };

    }
}
