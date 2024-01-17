package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21118 extends AbstractTestCaseServlet {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String dataCopy;
        {
            String data;
            data = "";
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null) {
                    data = cookieSources[0].getValue();
                }
            }
            dataCopy = data;
        }
        {
            String data = dataCopy;
            if (data != null) {
                response.getWriter().println("<br>handle(): data = " + data.replaceAll("(<script>)", ""));
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
