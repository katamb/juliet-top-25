package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16018 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(short data) throws Throwable {
        if (badPrivate) {
            if (data > 0)  {
                short result = (short) (data * 2);
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
