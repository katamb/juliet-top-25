package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE129_Improper_Validation_of_Array_Index__random_array_write_no_check_09_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_TRUE) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_TRUE) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
