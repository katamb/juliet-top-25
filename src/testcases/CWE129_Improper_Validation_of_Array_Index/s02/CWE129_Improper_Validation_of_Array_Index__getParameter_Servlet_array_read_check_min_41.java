package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_read_check_min_41 extends AbstractTestCaseServlet {
    private void badSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = Integer.MIN_VALUE;
        {
            String stringNumber = request.getParameter("name");
            try {
                data = Integer.parseInt(stringNumber.trim());
            } catch (NumberFormatException exceptNumberFormat) {
                IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
            }
        }
        badSink(data, request, response);
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    private void goodG2BSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        goodG2BSink(data, request, response);
    }
    private void goodB2GSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = Integer.MIN_VALUE;
        {
            String stringNumber = request.getParameter("name");
            try {
                data = Integer.parseInt(stringNumber.trim());
            } catch (NumberFormatException exceptNumberFormat) {
                IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
            }
        }
        goodB2GSink(data, request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}