package refactoring.Arithmetic;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DivisionTest {

    @Test
    @Parameters(method = "testRequestLoan_Parameters")
    public void calculate(int a, int b, int result) {

        Division division = new Division();
        int calculate = division.calculate(a, b);

        Assert.assertEquals(result, calculate);

    }

    @SuppressWarnings("unused")
    private static Object[][] testRequestLoan_Parameters() {
        return new Object[][]{
                {6, 3, 2},
                {9, 0, 4},
                {10, 2, 5}
        };

    }
}
