package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__Property_array_read_check_min_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = Integer.MIN_VALUE;
            {
                String stringNumber = System.getProperty("user.home");
                try {
                    data = Integer.parseInt(stringNumber.trim());
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
            break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                if (data >= 0) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
