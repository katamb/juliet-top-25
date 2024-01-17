package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_write_no_check_12_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        } else {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 100;
        } else {
            data = 100;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        } else {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
