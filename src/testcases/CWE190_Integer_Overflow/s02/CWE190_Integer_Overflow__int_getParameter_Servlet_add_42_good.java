package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_getParameter_Servlet_add_42_good extends AbstractTestCaseServlet {
    private int badSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        return data;
    }
    private int goodG2BSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = goodG2BSource(request, response);
        int result = (int) (data + 1);
        IO.writeLine("result: " + result);
    }
    private int goodB2GSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        return data;
    }
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = goodB2GSource(request, response);
        if (data < Integer.MAX_VALUE) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
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
