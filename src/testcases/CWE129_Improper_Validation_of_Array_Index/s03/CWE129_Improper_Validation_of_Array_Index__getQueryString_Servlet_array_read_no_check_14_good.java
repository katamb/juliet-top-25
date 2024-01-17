package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getQueryString_Servlet_array_read_no_check_14_good extends AbstractTestCaseServlet {
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (IO.staticFive != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (IO.staticFive == 5) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            data = Integer.MIN_VALUE;
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.startsWith("id="))  {
                        try {
                            data = Integer.parseInt(token.substring(3));
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception reading id from query string", exceptNumberFormat);
                        }
                        break;
                    }
                }
            }
        } else {
            data = 0;
        }
        if (IO.staticFive != 5) {
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
        if (IO.staticFive == 5) {
            data = Integer.MIN_VALUE;
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.startsWith("id="))  {
                        try {
                            data = Integer.parseInt(token.substring(3));
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception reading id from query string", exceptNumberFormat);
                        }
                        break;
                    }
                }
            }
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
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
