package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class J22281 extends AbstractTestCaseServlet {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            data = null;
        } else {
            data = "foo";
        }
        if (data != null) {
            response.getWriter().println("<br>handle() - <img src=\"" + data + "\">");
        }
    }
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = "foo";
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>handle() - <img src=\"" + data + "\">");
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B1(request, response);
        goodG2B2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
