package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short dataCopy;
        {
            short data;
            data = Short.MAX_VALUE;
            dataCopy = data;
        }
        {
            short data = dataCopy;
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
