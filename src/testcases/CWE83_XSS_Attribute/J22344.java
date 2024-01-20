package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class J22344 extends AbstractTestCaseServlet {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        while (true) {
            data = request.getParameter("name");
            break;
        }
        if (data != null) {
            response.getWriter().println("<br>handle() - <img src=\"" + data + "\">");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
