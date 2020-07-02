import org.junit.Assert;
import org.junit.Test;
import task5.operations.Operations;


public class CalcTest {

    @Test
    public void testSumOperations () throws Exception {
        Operations operations = new Operations();
        Assert.assertEquals(30, operations.calc(14, 16, "+"), 30);
    }
    @Test
    public void testMinOperations () throws Exception {
        Operations operations = new Operations();
        Assert.assertEquals(30, operations.calc(100, 70, "-"), 30);
    }
    @Test
    public void testMultOperations () throws Exception {
        Operations operations = new Operations();
        Assert.assertEquals(30, operations.calc(6, 5, "*"), 30);
    }
    @Test
    public void testDivOperations () throws Exception {
        Operations operations = new Operations();
        Assert.assertEquals(30, operations.calc(900, 30, "/"), 30);
    }
}
