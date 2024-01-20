package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21550 extends AbstractTestCaseServlet {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        switch (6) {
            case 6:
                data = request.getParameter("name");
                break;
            default:
                data = null;
                break;
        }
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
