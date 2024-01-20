package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20377 extends AbstractTestCase {
    private String dataB;
    private String dataGdG2B;
    private String dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS() throws Throwable {
        String data = dataGdG2B;
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
    private void processG2B() throws Throwable {
        String data;
        data = "5";
        dataGdG2B = data;
        gG2BS();
    }
    private void gB2GS() throws Throwable {
        String data = dataGdB2G;
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
    private void processB2G() throws Throwable {
        String data;
        data = System.getProperty("user.home");
        dataGdB2G = data;
        gB2GS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
