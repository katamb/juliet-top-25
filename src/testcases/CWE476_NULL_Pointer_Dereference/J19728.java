package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19728 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        StringBuilder data;
        data = null;
        bPrivate = true;
        badSink(data);
    }
    private void badSink(StringBuilder data) throws Throwable {
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
