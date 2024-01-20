package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20366 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        data = System.getProperty("user.home");
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
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
