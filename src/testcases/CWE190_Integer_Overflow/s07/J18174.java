package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18174 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        bPrivate = true;
        badSink(data);
    }
    private void badSink(short data) throws Throwable {
        if (bPrivate) {
            short result = (short) (++data);
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
