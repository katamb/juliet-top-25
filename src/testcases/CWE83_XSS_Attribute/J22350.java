package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class J22350 extends AbstractTestCaseServlet {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String dataCopy;
        {
            String data;
            data = request.getParameter("name");
            dataCopy = data;
        }
        {
            String data = dataCopy;
            if (data != null) {
                response.getWriter().println("<br>handle() - <img src=\"" + data + "\">");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
