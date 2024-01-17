package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE83_XSS_Attribute__Servlet_getParameter_Servlet_17_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        for (int i = 0; i < 1; i++) {
            if (data != null) {
                response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
