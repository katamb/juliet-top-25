package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19595 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        Integer data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Integer.valueOf(5);
        } else {
            data = Integer.valueOf(5);
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("" + data.toString());
        }
    }
    private void processB2G() throws Throwable {
        Integer data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data != null) {
                IO.writeLine("" + data.toString());
            } else {
                IO.writeLine("data is null");
            }
        } else {
            if (data != null) {
                IO.writeLine("" + data.toString());
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
