package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J15182 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        bPrivate = true;
        badSink(data);
    }
    private void badSink(int data) throws Throwable {
        if (bPrivate) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
