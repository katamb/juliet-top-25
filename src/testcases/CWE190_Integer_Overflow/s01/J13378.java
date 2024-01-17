package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13378 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        bPrivate = true;
        badSink(data);
    }
    private void badSink(byte data) throws Throwable {
        if (bPrivate) {
            if (data > 0)  {
                byte result = (byte) (data * 2);
                IO.writeLine("result: " + result);
            }
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
