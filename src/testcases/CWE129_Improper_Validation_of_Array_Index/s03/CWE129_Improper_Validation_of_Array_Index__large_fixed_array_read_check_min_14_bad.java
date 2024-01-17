package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_read_check_min_14_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            data = 100;
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
