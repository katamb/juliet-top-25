package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19584 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        Integer data;
        if (privateFive == 5) {
            data = null;
        } else {
            data = null;
        }
        if (privateFive == 5) {
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
