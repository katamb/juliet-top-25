package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
public class J22307 extends AbstractTestCaseServlet {
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String dataCopy;
        {
            String data;
            data = "foo";
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
