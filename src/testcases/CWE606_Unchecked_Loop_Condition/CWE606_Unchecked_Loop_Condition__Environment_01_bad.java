package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__Environment_01_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;
        data = System.getenv("ADD");
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
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
