package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class J14523 extends AbstractTestCaseServlet {
    private boolean bPrivate = false;
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        gB2G1(request, response);
        gB2G2(request, response);
        processG2B(request, response);
    }
    private void gB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
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
        gB2G1Private = false;
        gB2G1S(data, request, response);
    }
    private void gB2G1S(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (gB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void gB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
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
        gB2G2Private = true;
        gB2G2S(data, request, response);
    }
    private void gB2G2S(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (gB2G2Private) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        gG2BPrivate = true;
        gG2BS(data, request, response);
    }
    private void gG2BS(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (gG2BPrivate) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
