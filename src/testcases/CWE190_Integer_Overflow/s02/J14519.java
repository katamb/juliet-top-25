package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class J14519 extends AbstractTestCaseServlet {
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
            break;
        }
    }
    private void processB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
            data = Integer.MIN_VALUE;
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.startsWith("id="))  {
                        try {
                            data = Integer.parseInt(token.substring(3));
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception reading id from query string", exceptNumberFormat);
                        }
                        break;
                    }
                }
            }
            break;
        }
        while (true) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
            break;
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
        processB2G(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
