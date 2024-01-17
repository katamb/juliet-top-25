package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class CWE80_XSS__CWE182_Servlet_getQueryString_Servlet_21_bad extends AbstractTestCaseServlet {
    private boolean badPrivate = false;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        badPrivate = true;
        data = bad_source(request, response);
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
        }
    }
    private String bad_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (badPrivate) {
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
        return data;
    }
    private boolean goodG2B1_private = false;
    private boolean goodG2B2_private = false;
    private String goodG2B1_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (goodG2B1_private) {
            data = null;
        } else {
            data = "foo";
        }
        return data;
    }
    private String goodG2B2_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (goodG2B2_private) {
            data = "foo";
        } else {
            data = null;
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
