package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21946 extends AbstractTestCaseServlet {
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        switch (6) {
            case 6:
                data = request.getParameter("name");
                break;
            default:
                data = null;
                break;
        }
        if (data != null) {
            response.sendError(404, "<br>handle() - Parameter name has value " + data);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
