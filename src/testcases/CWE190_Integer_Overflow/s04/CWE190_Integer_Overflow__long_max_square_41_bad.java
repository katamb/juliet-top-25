package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_square_41_bad extends AbstractTestCase {
    private void badSink(long data) throws Throwable {
        long result = (long) (data * data);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
