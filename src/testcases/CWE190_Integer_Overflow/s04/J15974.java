package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15974 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        bPrivate = true;
        bS(data);
    }
    private void bS(short data) throws Throwable {
        if (bPrivate) {
            short result = (short) (data + 1);
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
