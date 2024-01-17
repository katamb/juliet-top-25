package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__Environment_array_write_no_check_06_bad extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Integer.MIN_VALUE;
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null)
                {
                    try {
                        data = Integer.parseInt(stringNumber.trim());
                    } catch (NumberFormatException exceptNumberFormat) {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
