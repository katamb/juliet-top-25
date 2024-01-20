package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21959 extends AbstractTestCaseServlet {
    private String bSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        return data;
    }
    private String gdG2BSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = gdG2BSce(request, response);
        if (data != null) {
            response.sendError(404, "<br>handle() - Parameter name has value " + data);
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
