package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21160 extends AbstractTestCaseServlet {
    private boolean bPrivate = false;
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        bPrivate = true;
        data = b_source(request, response);
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data.replaceAll("(<script>)", ""));
        }
    }
    private String b_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (bPrivate) {
            data = request.getParameter("name");
        } else {
            data = null;
        }
        return data;
    }
    private boolean gdG2B1_private = false;
    private boolean gdG2B2_private = false;
    private String gdG2B1_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (gdG2B1_private) {
            data = null;
        } else {
            data = "foo";
        }
        return data;
    }
    private String gdG2B2_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (gdG2B2_private) {
            data = "foo";
        } else {
            data = null;
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
