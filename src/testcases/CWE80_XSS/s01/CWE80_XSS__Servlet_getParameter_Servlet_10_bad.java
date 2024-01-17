package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE80_XSS__Servlet_getParameter_Servlet_10_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = request.getParameter("name");
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
