package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class J21604 extends AbstractTestCaseServlet {
    private void bS(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
    }
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
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
        bS(data, request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
