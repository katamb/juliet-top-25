package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__getQueryString_Servlet_array_read_check_max_04_bad extends AbstractTestCaseServlet {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
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
        if (PRIVATE_STATIC_FINAL_TRUE) {
            int array[] = {0, 1, 2, 3, 4};
            if (data < array.length) {
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
