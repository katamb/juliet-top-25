package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11771 extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    private void goodG2B1() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void goodG2B2() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void goodB2G1() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = 100;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
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
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = 100;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
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
