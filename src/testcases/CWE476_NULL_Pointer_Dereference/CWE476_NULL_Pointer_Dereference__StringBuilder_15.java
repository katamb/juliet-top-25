package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_15 extends AbstractTestCase {
    public void bad() throws Throwable {
        StringBuilder data;
        switch (6) {
            case 6:
                data = null;
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                IO.writeLine("" + data.length());
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B1() throws Throwable {
        StringBuilder data;
        switch (5) {
            case 6:
                data = null;
                break;
            default:
                data = new StringBuilder();
                break;
        }
        switch (7) {
            case 7:
                IO.writeLine("" + data.length());
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B2() throws Throwable {
        StringBuilder data;
        switch (6) {
            case 6:
                data = new StringBuilder();
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                IO.writeLine("" + data.length());
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodB2G1() throws Throwable {
        StringBuilder data;
        switch (6) {
            case 6:
                data = null;
                break;
            default:
                data = null;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                if (data != null) {
                    IO.writeLine("" + data.length());
                } else {
                    IO.writeLine("data is null");
                }
                break;
        }
    }
    private void goodB2G2() throws Throwable {
        StringBuilder data;
        switch (6) {
            case 6:
                data = null;
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                if (data != null) {
                    IO.writeLine("" + data.length());
                } else {
                    IO.writeLine("data is null");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void good() throws Throwable {
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