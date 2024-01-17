package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
public class CWE81_XSS_Error_Message__Servlet_File_41_good extends AbstractTestCaseServlet {
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    private void goodG2BSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (data != null) {
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        goodG2BSink(data, request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
