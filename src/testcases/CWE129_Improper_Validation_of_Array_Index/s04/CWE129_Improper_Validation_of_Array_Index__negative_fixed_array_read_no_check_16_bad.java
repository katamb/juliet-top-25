package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_no_check_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        while (true) {
            data = -1;
            break;
        }
        while (true) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
