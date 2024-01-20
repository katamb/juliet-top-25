package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15580 extends AbstractTestCase {
    public void handle() throws Throwable {
        long dataCopy;
        {
            long data;
            data = Long.MAX_VALUE;
            dataCopy = data;
        }
        {
            long data = dataCopy;
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
