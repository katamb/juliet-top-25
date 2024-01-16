package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE129_Improper_Validation_of_Array_Index__random_array_read_no_check_08 extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void bad() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (privateReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    private void goodG2B1() throws Throwable {
        int data;
        if (privateReturnsFalse()) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    private void goodG2B2() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    private void goodB2G1() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (privateReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (privateReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
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