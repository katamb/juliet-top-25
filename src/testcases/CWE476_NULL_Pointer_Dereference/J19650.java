package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19650 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void handle() throws Throwable {
        int[] data;
        data = null;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(int[] data) throws Throwable {
        if (badPrivate) {
            IO.writeLine("" + data.length);
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
