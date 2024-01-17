package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_21_bad extends AbstractTestCase {
    private boolean badPrivate = false;
    public void bad() throws Throwable {
        StringBuilder data;
        data = null;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(StringBuilder data) throws Throwable {
        if (badPrivate) {
            IO.writeLine("" + data.length());
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
