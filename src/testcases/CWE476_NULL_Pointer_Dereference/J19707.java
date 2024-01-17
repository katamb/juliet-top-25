package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19707 extends AbstractTestCase {
    private int privateFive = 5;
    private void processG2B1() throws Throwable {
        StringBuilder data;
        if (privateFive != 5) {
            data = null;
        } else {
            data = new StringBuilder();
        }
        if (privateFive == 5) {
            IO.writeLine("" + data.length());
        }
    }
    private void processG2B2() throws Throwable {
        StringBuilder data;
        if (privateFive == 5) {
            data = new StringBuilder();
        } else {
            data = null;
        }
        if (privateFive == 5) {
            IO.writeLine("" + data.length());
        }
    }
    private void processB2G1() throws Throwable {
        StringBuilder data;
        if (privateFive == 5) {
            data = null;
        } else {
            data = null;
        }
        if (privateFive != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void processB2G2() throws Throwable {
        StringBuilder data;
        if (privateFive == 5) {
            data = null;
        } else {
            data = null;
        }
        if (privateFive == 5) {
            if (data != null) {
                IO.writeLine("" + data.length());
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
