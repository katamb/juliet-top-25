package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class J21996 extends AbstractTestCaseServlet {
    private boolean bPrivate = false;
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        bPrivate = true;
        data = b_source(request, response);
        if (data != null) {
            response.sendError(404, "<br>handle() - Parameter name has value " + data);
        }
    }
    private String b_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (bPrivate) {
            data = "";
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.startsWith("id="))  {
                        data = token.substring(3);
                        break;
                    }
                }
            }
        } else {
            data = null;
        }
        return data;
    }
    private boolean gdG2B1_private = false;
    private boolean gdG2B2_private = false;
    private String gdG2B1_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (gdG2B1_private) {
            data = null;
        } else {
            data = "foo";
        }
        return data;
    }
    private String gdG2B2_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (gdG2B2_private) {
            data = "foo";
        } else {
            data = null;
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
