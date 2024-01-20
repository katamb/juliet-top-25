package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class J11613 extends AbstractTestCaseServlet {
    private void gG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (5) {
            case 6:
                data = 0;
                break;
            default:
                data = 2;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                if (data >= 0) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void gG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = 2;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                if (data >= 0) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void gB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (6) {
            case 6:
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
            default:
                data = 0;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                int array[] = {0, 1, 2, 3, 4};
                if (data >= 0 && data < array.length) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
                break;
        }
    }
    private void gB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        switch (6) {
            case 6:
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
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                if (data >= 0 && data < array.length) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        gG2B1(request, response);
        gG2B2(request, response);
        gB2G1(request, response);
        gB2G2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
