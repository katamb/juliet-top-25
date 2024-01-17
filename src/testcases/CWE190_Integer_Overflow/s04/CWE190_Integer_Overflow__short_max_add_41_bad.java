package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_41_bad extends AbstractTestCase {
    private void badSink(short data) throws Throwable {
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
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
