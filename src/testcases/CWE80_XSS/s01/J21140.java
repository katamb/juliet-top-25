package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21140 extends AbstractTestCaseServlet {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (privateReturnsTrue()) {
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
