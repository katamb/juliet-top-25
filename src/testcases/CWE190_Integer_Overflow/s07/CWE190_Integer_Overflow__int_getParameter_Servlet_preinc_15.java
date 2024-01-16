package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_getParameter_Servlet_preinc_15 extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (6) {
            case 6:
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
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int result = (int) (++data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (5) {
            case 6:
                data = 0;
                break;
            default:
                data = 2;
                break;
        }
        switch (7) {
            case 7:
                int result = (int) (++data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = 2;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int result = (int) (++data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (6) {
            case 6:
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
            default:
                data = 0;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                if (data < Integer.MAX_VALUE) {
                    int result = (int) (++data);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to increment.");
                }
                break;
        }
    }
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (6) {
            case 6:
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
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                if (data < Integer.MAX_VALUE) {
                    int result = (int) (++data);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to increment.");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B1(request, response);
        goodG2B2(request, response);
        goodB2G1(request, response);
        goodB2G2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}