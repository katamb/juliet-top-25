package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21146 extends AbstractTestCaseServlet {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticReturnsTrue()) {
            data = request.getParameter("name");
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data.replaceAll("(<script>)", ""));
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
