package testcases.CWE129_Improper_Validation_of_Array_Index.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__Environment_array_read_check_max_16_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        int data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            int array[] = {0, 1, 2, 3, 4};
            if (data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
            break;
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        while (true) {
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
            break;
        }
        while (true) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
            break;
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
