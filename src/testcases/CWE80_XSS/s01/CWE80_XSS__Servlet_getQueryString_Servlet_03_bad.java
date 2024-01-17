package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class CWE80_XSS__Servlet_getQueryString_Servlet_03_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (5 == 5) {
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
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
