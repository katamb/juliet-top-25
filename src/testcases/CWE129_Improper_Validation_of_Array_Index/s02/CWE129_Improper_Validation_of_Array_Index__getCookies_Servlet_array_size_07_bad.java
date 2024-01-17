package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_size_07_bad extends AbstractTestCaseServlet {
    private int privateFive = 5;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateFive == 5) {
            data = Integer.MIN_VALUE;
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null) {
                    String stringNumber = cookieSources[0].getValue();
                    try {
                        data = Integer.parseInt(stringNumber.trim());
                    } catch (NumberFormatException exceptNumberFormat) {
                        IO.logger.log(Level.WARNING, "Number format exception reading data from cookie", exceptNumberFormat);
                    }
                }
            }
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            int array[] = null;
            if (data >= 0) {
                array = new int[data];
            } else {
                IO.writeLine("Array size is negative");
            }
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
