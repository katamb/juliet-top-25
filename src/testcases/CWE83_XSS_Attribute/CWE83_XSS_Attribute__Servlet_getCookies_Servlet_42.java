package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE83_XSS_Attribute__Servlet_getCookies_Servlet_42 extends AbstractTestCaseServlet {
    private String badSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
        return data;
    }
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = badSource(request, response);
        if (data != null) {
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
        }
    }
    private String goodG2BSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = goodG2BSource(request, response);
        if (data != null) {
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}