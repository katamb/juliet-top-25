package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getQueryString_Servlet_array_write_no_check_41_good extends AbstractTestCaseServlet {
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    private void goodG2BSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        goodG2BSink(data, request, response);
    }
    private void goodB2GSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            array[data] = 42;
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
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
        goodB2GSink(data, request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
