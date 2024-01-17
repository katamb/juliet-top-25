package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_add_21_bad extends AbstractTestCase {
    private boolean badPrivate = false;
    public void bad() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        badPrivate = true;
        badSink(data);
    }
    private void badSink(int data) throws Throwable {
        if (badPrivate) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
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
