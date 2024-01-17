package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_12_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = "This is not null";
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
