package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_06_good extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    private void goodG2B1() throws Throwable {
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
    private void goodG2B2() throws Throwable {
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
    private void goodB2G1() throws Throwable {
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
    private void goodB2G2() throws Throwable {
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
