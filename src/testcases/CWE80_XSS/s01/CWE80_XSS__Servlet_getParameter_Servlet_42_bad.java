package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE80_XSS__Servlet_getParameter_Servlet_42_bad extends AbstractTestCaseServlet {
    private String badSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        return data;
    }
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = badSource(request, response);
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    private String goodG2BSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
