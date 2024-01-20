package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21115 extends AbstractTestCaseServlet {
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        for (int i = 0; i < 1; i++) {
            if (data != null) {
                response.getWriter().println("<br>handle(): data = " + data.replaceAll("(<script>)", ""));
            }
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
