package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class CWE606_Unchecked_Loop_Condition__getQueryString_Servlet_17_good extends AbstractTestCaseServlet {
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "5";
        for (int j = 0; j < 1; j++) {
            int numberOfLoops;
            try {
                numberOfLoops = Integer.parseInt(data);
            } catch (NumberFormatException exceptNumberFormat) {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
            for (int i = 0; i < numberOfLoops; i++) {
                IO.writeLine("hello world");
            }
        }
    }
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        for (int k = 0; k < 1; k++) {
            int numberOfLoops;
            try {
                numberOfLoops = Integer.parseInt(data);
            } catch (NumberFormatException exceptNumberFormat) {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
            if (numberOfLoops >= 0 && numberOfLoops <= 5) {
                for (int i = 0; i < numberOfLoops; i++) {
                    IO.writeLine("hello world");
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
