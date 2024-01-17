package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class J11759 extends AbstractTestCaseServlet {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
        processB2G(request, response);
    }
    private void gG2BSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = dataGdG2B;
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        dataGdG2B = data;
        gG2BSink(request, response);
    }
    private void gB2GSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = dataGdB2G;
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            array[data] = 42;
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    private void processB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        dataGdB2G = data;
        gB2GSink(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
