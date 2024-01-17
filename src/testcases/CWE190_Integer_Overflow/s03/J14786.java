package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14786 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void handle() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
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
