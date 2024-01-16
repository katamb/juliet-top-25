package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_31 extends AbstractTestCase {
    public void bad() throws Throwable {
        int dataCopy;
        {
            int data;
            data = Integer.MIN_VALUE;
            {
                String stringNumber = System.getProperty("user.home");
                try {
                    data = Integer.parseInt(stringNumber.trim());
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        int dataCopy;
        {
            int data;
            data = 2;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    private void goodB2G() throws Throwable {
        int dataCopy;
        {
            int data;
            data = Integer.MIN_VALUE;
            {
                String stringNumber = System.getProperty("user.home");
                try {
                    data = Integer.parseInt(stringNumber.trim());
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
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