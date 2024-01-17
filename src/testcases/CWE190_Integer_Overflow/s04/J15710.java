package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15710 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        bPrivate = true;
        badSink(data);
    }
    private void badSink(long data) throws Throwable {
        if (bPrivate) {
            long result = (long) (data + 1);
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
