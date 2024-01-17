package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_05_bad extends AbstractTestCaseServlet {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (privateTrue) {
            data = request.getParameter("name");
        } else {
            data = null;
        }
        if (data != null) {
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
