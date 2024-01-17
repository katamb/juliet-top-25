package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19743 extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        String data;
        if (5 != 5) {
            data = null;
        } else {
            data = "This is not null";
        }
        if (5 == 5) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodG2B2() throws Throwable {
        String data;
        if (5 == 5) {
            data = "This is not null";
        } else {
            data = null;
        }
        if (5 == 5) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G1() throws Throwable {
        String data;
        if (5 == 5) {
            data = null;
        } else {
            data = null;
        }
        if (5 != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        String data;
        if (5 == 5) {
            data = null;
        } else {
            data = null;
        }
        if (5 == 5) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public void process() throws Throwable {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
