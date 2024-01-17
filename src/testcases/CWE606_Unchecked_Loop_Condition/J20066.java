package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20066 extends AbstractTestCase {
    private String bSce() throws Throwable {
        String data;
        data = System.getenv("ADD");
        return data;
    }
    public void handle() throws Throwable {
        String data = bSce();
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
    private String processG2BSce() throws Throwable {
        String data;
        data = "5";
        return data;
    }
    private String processB2GSce() throws Throwable {
        String data;
        data = System.getenv("ADD");
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
