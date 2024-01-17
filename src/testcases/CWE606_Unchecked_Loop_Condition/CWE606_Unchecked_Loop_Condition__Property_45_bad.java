package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__Property_45_bad extends AbstractTestCase {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    private void badSink() throws Throwable {
        String data = dataBad;
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
    public void bad() throws Throwable {
        String data;
        data = System.getProperty("user.home");
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
