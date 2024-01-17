package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_write_no_check_42_bad extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public void bad() throws Throwable {
        int data = badSource();
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
