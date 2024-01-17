package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class CWE83_XSS_Attribute__Servlet_getQueryString_Servlet_41_good extends AbstractTestCaseServlet {
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    private void goodG2BSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (data != null) {
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
        }
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        goodG2BSink(data, request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
