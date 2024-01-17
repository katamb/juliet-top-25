package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE80_XSS__Servlet_getParameter_Servlet_41_bad extends AbstractTestCaseServlet {
    private void badSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        badSink(data, request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
