package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_16_good extends AbstractTestCaseServlet {
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
            data = Integer.MIN_VALUE;
            {
                String stringNumber = request.getParameter("name");
                try {
                    data = Integer.parseInt(stringNumber.trim());
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
                }
            }
            break;
        }
        while (true) {
            if (data < Integer.MAX_VALUE) {
                data++;
                int result = (int) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
            break;
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
