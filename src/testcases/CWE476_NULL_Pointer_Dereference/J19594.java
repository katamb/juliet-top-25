package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19594 extends AbstractTestCase {
    public void handle() throws Throwable {
        Integer data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = Integer.valueOf(5);
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.toString());
        } else {
            if (data != null) {
                IO.writeLine("" + data.toString());
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
