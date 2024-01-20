package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19601 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        Integer data;
        switch (5) {
            case 6:
                data = null;
                break;
            default:
                data = Integer.valueOf(5);
                break;
        }
        switch (7) {
            case 7:
                IO.writeLine("" + data.toString());
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processG2B2() throws Throwable {
        Integer data;
        switch (6) {
            case 6:
                data = Integer.valueOf(5);
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                IO.writeLine("" + data.toString());
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processB2G1() throws Throwable {
        Integer data;
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
                    IO.writeLine("" + data.toString());
                } else {
                    IO.writeLine("data is null");
                }
                break;
        }
    }
    private void processB2G2() throws Throwable {
        Integer data;
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
                    IO.writeLine("" + data.toString());
                } else {
                    IO.writeLine("data is null");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void process() throws Throwable {
        processG2B1();
        processG2B2();
        processB2G1();
        processB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
