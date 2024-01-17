package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_multiply_42_bad extends AbstractTestCase {
    private long badSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public void bad() throws Throwable {
        long data = badSource();
        if (data > 0)  {
            long result = (long) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private long goodG2BSource() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private long goodB2GSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
