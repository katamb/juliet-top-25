package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18044 extends AbstractTestCase {
    public void handle() throws Throwable {
        long dataCopy;
        {
            long data;
            data = Long.MAX_VALUE;
            dataCopy = data;
        }
        {
            long data = dataCopy;
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
