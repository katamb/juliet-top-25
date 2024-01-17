package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21510 extends AbstractTestCaseServlet {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSces[] = request.getCookies();
            if (cookieSces != null) {
                data = cookieSces[0].getValue();
            }
        }
        for (int i = 0; i < 1; i++) {
            if (data != null) {
                response.getWriter().println("<br>handle(): data = " + data);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
