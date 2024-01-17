package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19577 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        Integer data;
        if (5 != 5) {
            data = null;
        } else {
            data = Integer.valueOf(5);
        }
        if (5 == 5) {
            IO.writeLine("" + data.toString());
        }
    }
    private void processG2B2() throws Throwable {
        Integer data;
        if (5 == 5) {
            data = Integer.valueOf(5);
        } else {
            data = null;
        }
        if (5 == 5) {
            IO.writeLine("" + data.toString());
        }
    }
    private void processB2G1() throws Throwable {
        Integer data;
        if (5 == 5) {
            data = null;
        } else {
            data = null;
        }
        if (5 != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.toString());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void processB2G2() throws Throwable {
        Integer data;
        if (5 == 5) {
            data = null;
        } else {
            data = null;
        }
        if (5 == 5) {
            if (data != null) {
                IO.writeLine("" + data.toString());
            } else {
                IO.writeLine("data is null");
            }
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
