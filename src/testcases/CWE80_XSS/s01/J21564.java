package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21564 extends AbstractTestCaseServlet {
    private String dataB;
    private String dataGdG2B;
    private void bS(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataB;
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
    }
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        dataB = data;
        bS(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
