package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class CWE80_XSS__Servlet_getQueryString_Servlet_16_good extends AbstractTestCaseServlet {
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        while (true) {
            data = "foo";
            break;
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
