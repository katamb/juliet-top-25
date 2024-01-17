package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE80_XSS__CWE182_Servlet_getParameter_Servlet_16_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        while (true) {
            data = request.getParameter("name");
            break;
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
