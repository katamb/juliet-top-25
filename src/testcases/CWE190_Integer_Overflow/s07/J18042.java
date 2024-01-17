package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18042 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        bPrivate = true;
        badSink(data);
    }
    private void badSink(long data) throws Throwable {
        if (bPrivate) {
            long result = (long) (++data);
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
