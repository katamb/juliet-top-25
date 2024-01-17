package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16282 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        bPrivate = true;
        bS(data);
    }
    private void bS(byte data) throws Throwable {
        if (bPrivate) {
            data++;
            byte result = (byte) (data);
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
