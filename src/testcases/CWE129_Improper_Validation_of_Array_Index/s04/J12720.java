package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J12720 extends AbstractTestCase {
    public void handle() throws Throwable {
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
            array[data] = 42;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
