package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE129_Improper_Validation_of_Array_Index__random_array_read_no_check_04_bad extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
