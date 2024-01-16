package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE129_Improper_Validation_of_Array_Index__random_array_read_no_check_01 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    private void goodB2G() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
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