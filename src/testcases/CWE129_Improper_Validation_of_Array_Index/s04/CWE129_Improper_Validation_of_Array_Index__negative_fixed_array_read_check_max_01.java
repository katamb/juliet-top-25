package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_check_max_01 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        data = -1;
        int array[] = {0, 1, 2, 3, 4};
        if (data < array.length) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        int array[] = {0, 1, 2, 3, 4};
        if (data < array.length) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        data = -1;
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}