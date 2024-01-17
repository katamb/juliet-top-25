package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19772 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        String data;
        data = null;
        bPrivate = true;
        badSink(data);
    }
    private void badSink(String data) throws Throwable {
        if (bPrivate) {
            IO.writeLine("" + data.length());
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
