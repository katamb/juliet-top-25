package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15754 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void handle() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        badPrivate = true;
        badSink(data);
    }
    private void badSink(long data) throws Throwable {
        if (badPrivate) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
