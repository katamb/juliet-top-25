package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
public class CWE80_XSS__CWE182_Servlet_connect_tcp_04 extends AbstractTestCaseServlet {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = "";
            {
                Socket socket = null;
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try {
                    socket = new Socket("host.example.org", 39544);
                    readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    data = readerBuffered.readLine();
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                } finally {
                    try {
                        if (readerBuffered != null) {
                            readerBuffered.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }
                    try {
                        if (readerInputStream != null) {
                            readerInputStream.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }
                    try {
                        if (socket != null) {
                            socket.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
                }
            }
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
        }
    }
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_FALSE) {
            data = null;
        } else {
            data = "foo";
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
        }
    }
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = "foo";
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data.replaceAll("(<script>)", ""));
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