package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__Property_42_bad extends AbstractTestCase {
    private String badSource() throws Throwable {
        String data;
        data = System.getProperty("user.home");
        return data;
    }
    public void bad() throws Throwable {
        String data = badSource();
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
    private String goodG2BSource() throws Throwable {
        String data;
        data = "5";
        return data;
    }
    private String goodB2GSource() throws Throwable {
        String data;
        data = System.getProperty("user.home");
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
