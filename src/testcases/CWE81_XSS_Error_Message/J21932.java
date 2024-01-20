package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
public class J21932 extends AbstractTestCaseServlet {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (privateReturnsTrue()) {
            data = request.getParameter("name");
        } else {
            data = null;
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
