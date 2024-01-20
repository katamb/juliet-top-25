package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15624 extends AbstractTestCase {
    public void handle() throws Throwable {
        long dataCopy;
        {
            long data;
            data = Long.MAX_VALUE;
            dataCopy = data;
        }
        {
            long data = dataCopy;
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
