package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class J22400 extends AbstractTestCaseServlet {
    private String dataB;
    private String dataGdG2B;
    private void bS(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataB;
        if (data != null) {
            response.getWriter().println("<br>handle() - <img src=\"" + data + "\">");
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
        dataB = data;
        bS(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
