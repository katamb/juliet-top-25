package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class CWE81_XSS_Error_Message__Servlet_getQueryString_Servlet_04_bad extends AbstractTestCaseServlet {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = "";
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.startsWith("id="))  {
                        data = token.substring(3);
                        break;
                    }
                }
            }
        } else {
            data = null;
        }
        if (data != null) {
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
