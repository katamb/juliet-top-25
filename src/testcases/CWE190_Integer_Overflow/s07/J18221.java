package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18221 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        short dataCopy;
        {
            short data;
            data = 2;
            dataCopy = data;
        }
        {
            short data = dataCopy;
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        short dataCopy;
        {
            short data;
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
            dataCopy = data;
        }
        {
            short data = dataCopy;
            if (data < Short.MAX_VALUE) {
                short result = (short) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
