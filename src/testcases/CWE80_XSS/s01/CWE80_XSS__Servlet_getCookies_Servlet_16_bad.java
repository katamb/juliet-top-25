package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE80_XSS__Servlet_getCookies_Servlet_16_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        while (true) {
            data = "";
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null) {
                    data = cookieSources[0].getValue();
                }
            }
            break;
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
