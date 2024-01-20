package testcases.CWE80_XSS.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
public class J21697 extends AbstractTestCaseServlet {
    private String dataB;
    private String dataGdG2B;
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
    }
    private void gG2BS(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataGdG2B;
        if (data != null) {
            response.getWriter().println("<br>handle(): data = " + data);
        }
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        dataGdG2B = data;
        gG2BS(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
