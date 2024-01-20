package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20375 extends AbstractTestCase {
    private String bSce() throws Throwable {
        String data;
        data = System.getProperty("user.home");
        return data;
    }
    private String processG2BSce() throws Throwable {
        String data;
        data = "5";
        return data;
    }
    private void processG2B() throws Throwable {
        String data = processG2BSce();
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
    private String processB2GSce() throws Throwable {
        String data;
        data = System.getProperty("user.home");
        return data;
    }
    private void processB2G() throws Throwable {
        String data = processB2GSce();
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
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
