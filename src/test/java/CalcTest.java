import org.junit.Assert;
import org.junit.Test;
import task5.operations.IncorrectOperationTypeExeption;
import task5.operations.Operations;

import java.util.InputMismatchException;


public class CalcTest {

    @Test
    public void testSumOperations () throws Exception {
        Assert.assertEquals(30, Operations.calc(14, 16, "+"), 30);
    }
    @Test
    public void testMinOperations () throws Exception {
        Assert.assertEquals(30, Operations.calc(100, 70, "-"), 30);
    }
    @Test
    public void testMultOperations () throws Exception {
        Assert.assertEquals(30, Operations.calc(6, 5, "*"), 30);
    }
    @Test
    public void testDivOperations () throws Exception {
        Assert.assertEquals(30, Operations.calc(900, 30, "/"), 30);
    }
    @Test(expected = IncorrectOperationTypeExeption.class)
    public void testIncorrectOperationTypeExeption() throws Exception{
        Operations.calc(4,5,"d");
    }
    @Test(expected = ArithmeticException.class)
    public void testArithmeticException() throws Exception{
        Operations.calc(4,0,"/");
    }
}
