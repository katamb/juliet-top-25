package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
public class CWE80_XSS__Servlet_connect_tcp_08_good extends AbstractTestCaseServlet {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (privateReturnsFalse()) {
            data = null;
        } else {
            data = "foo";
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (privateReturnsTrue()) {
            data = "foo";
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B1(request, response);
        goodG2B2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
