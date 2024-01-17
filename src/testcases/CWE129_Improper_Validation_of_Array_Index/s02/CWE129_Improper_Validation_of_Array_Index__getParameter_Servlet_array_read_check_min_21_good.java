package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getParameter_Servlet_array_read_check_min_21_good extends AbstractTestCaseServlet {
    private boolean badPrivate = false;
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodB2G1(request, response);
        goodB2G2(request, response);
        goodG2B(request, response);
    }
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        goodB2G1Private = false;
        goodB2G1Sink(data, request, response);
    }
    private void goodB2G1Sink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (goodB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        goodB2G2Private = true;
        goodB2G2Sink(data, request, response);
    }
    private void goodB2G2Sink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (goodB2G2Private) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        goodG2BPrivate = true;
        goodG2BSink(data, request, response);
    }
    private void goodG2BSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (goodG2BPrivate) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
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
