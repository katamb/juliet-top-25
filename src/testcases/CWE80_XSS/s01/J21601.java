package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class J21601 extends AbstractTestCaseServlet {
    private boolean bPrivate = false;
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
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        gG2B1(request, response);
        gG2B2(request, response);
    }
    private void gG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        gdG2B1_private = false;
        data = gdG2B1_source(request, response);
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
    }
    private String gdG2B1_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (gdG2B1_private) {
            data = null;
        } else {
            data = "foo";
        }
        return data;
    }
    private void gG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        gdG2B2_private = true;
        data = gdG2B2_source(request, response);
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
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
