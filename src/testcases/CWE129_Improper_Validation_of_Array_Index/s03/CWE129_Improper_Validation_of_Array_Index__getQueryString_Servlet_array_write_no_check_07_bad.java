package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getQueryString_Servlet_array_write_no_check_07_bad extends AbstractTestCaseServlet {
    private int privateFive = 5;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateFive == 5) {
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
        if (privateFive == 5) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
