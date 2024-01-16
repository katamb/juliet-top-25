package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_getQueryString_Servlet_multiply_12 extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
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
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
        } else {
            if (data > 0)  {
                if (data < (Integer.MAX_VALUE / 2)) {
                    int result = (int) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
        } else {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
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
        } else {
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
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data > 0)  {
                if (data < (Integer.MAX_VALUE / 2)) {
                    int result = (int) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        } else {
            if (data > 0)  {
                if (data < (Integer.MAX_VALUE / 2)) {
                    int result = (int) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}