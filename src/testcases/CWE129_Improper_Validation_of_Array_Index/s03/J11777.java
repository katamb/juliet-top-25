package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11777 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_FALSE) {
            data = 0;
        } else {
            data = 2;
        }
        if (IO.STATIC_FINAL_TRUE) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void processG2B2() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_TRUE) {
            data = 2;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_TRUE) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void processB2G1() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_TRUE) {
            data = 100;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_FALSE) {
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
    private void processB2G2() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_TRUE) {
            data = 100;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_TRUE) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
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
