package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_01_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        data = -1;
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
