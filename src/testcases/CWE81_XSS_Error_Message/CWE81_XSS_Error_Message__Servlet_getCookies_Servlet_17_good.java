package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE81_XSS_Error_Message__Servlet_getCookies_Servlet_17_good extends AbstractTestCaseServlet {
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        for (int i = 0; i < 1; i++) {
            if (data != null) {
                response.sendError(404, "<br>bad() - Parameter name has value " + data);
            }
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
