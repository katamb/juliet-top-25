package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19606 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void handle() throws Throwable {
        Integer data;
        data = null;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(Integer data) throws Throwable {
        if (badPrivate) {
            IO.writeLine("" + data.toString());
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
