package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class J22310 extends AbstractTestCaseServlet {
    private String bSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSces[] = request.getCookies();
            if (cookieSces != null) {
                data = cookieSces[0].getValue();
            }
        }
        return data;
    }
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = bSce(request, response);
        if (data != null) {
            response.getWriter().println("<br>handle() - <img src=\"" + data + "\">");
        }
    }
    private String gdG2BSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
