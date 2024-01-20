package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19761 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = "This is not null";
        } else {
            data = "This is not null";
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("" + data.length());
        }
    }
    private void processB2G() throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
