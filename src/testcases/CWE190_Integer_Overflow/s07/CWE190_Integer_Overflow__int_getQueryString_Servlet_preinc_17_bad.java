package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_getQueryString_Servlet_preinc_17_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        for (int j = 0; j < 1; j++) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
