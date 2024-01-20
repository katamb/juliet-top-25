package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21527 extends AbstractTestCaseServlet {
    private void gG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (5 != 5) {
            data = null;
        } else {
            data = "foo";
        }
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
    }
    private void gG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (5 == 5) {
            data = "foo";
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        gG2B1(request, response);
        gG2B2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
