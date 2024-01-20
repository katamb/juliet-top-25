package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19583 extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    private void processG2B1() throws Throwable {
        Integer data;
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            data = null;
        } else {
            data = Integer.valueOf(5);
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            IO.writeLine("" + data.toString());
        }
    }
    private void processG2B2() throws Throwable {
        Integer data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Integer.valueOf(5);
        } else {
            data = null;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            IO.writeLine("" + data.toString());
        }
    }
    private void processB2G1() throws Throwable {
        Integer data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = null;
        } else {
            data = null;
        }
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
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
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = null;
        } else {
            data = null;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
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
