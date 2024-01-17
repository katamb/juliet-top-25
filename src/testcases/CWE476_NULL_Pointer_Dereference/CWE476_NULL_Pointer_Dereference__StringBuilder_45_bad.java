package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_45_bad extends AbstractTestCase {
    private StringBuilder dataBad;
    private StringBuilder dataGoodG2B;
    private StringBuilder dataGoodB2G;
    private void badSink() throws Throwable {
        StringBuilder data = dataBad;
        IO.writeLine("" + data.length());
    }
    public void bad() throws Throwable {
        StringBuilder data;
        data = null;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
