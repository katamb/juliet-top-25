package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getCookies_Servlet_array_write_no_check_17_good extends AbstractTestCaseServlet {
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
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
        for (int k = 0; k < 1; k++) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
