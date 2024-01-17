package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_12_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = new StringBuilder();
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.length());
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
