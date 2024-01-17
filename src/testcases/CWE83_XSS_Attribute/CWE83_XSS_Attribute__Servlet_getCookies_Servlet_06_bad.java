package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE83_XSS_Attribute__Servlet_getCookies_Servlet_06_bad extends AbstractTestCaseServlet {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = "";
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null) {
                    data = cookieSources[0].getValue();
                }
            }
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
