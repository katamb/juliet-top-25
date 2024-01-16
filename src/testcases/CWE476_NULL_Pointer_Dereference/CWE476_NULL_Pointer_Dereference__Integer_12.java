package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_12 extends AbstractTestCase {
    public void bad() throws Throwable {
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
    private void goodG2B() throws Throwable {
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
    private void goodB2G() throws Throwable {
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
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}