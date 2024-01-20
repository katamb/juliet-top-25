package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19606 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        Integer data;
        data = null;
        bPrivate = true;
        bS(data);
    }
    private void bS(Integer data) throws Throwable {
        if (bPrivate) {
            IO.writeLine("" + data.toString());
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
