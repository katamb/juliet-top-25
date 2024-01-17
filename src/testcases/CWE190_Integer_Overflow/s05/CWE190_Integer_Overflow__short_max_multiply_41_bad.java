package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_multiply_41_bad extends AbstractTestCase {
    private void badSink(short data) throws Throwable {
        if (data > 0)  {
            short result = (short) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    public void bad() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
