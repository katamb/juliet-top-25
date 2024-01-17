package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE80_XSS__CWE182_Servlet_getParameter_Servlet_45_bad extends AbstractTestCaseServlet {
    private String dataBad;
    private String dataGoodG2B;
    private void badSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataBad;
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
        }
    }
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        dataBad = data;
        badSink(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
