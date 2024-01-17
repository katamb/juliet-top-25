package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19736 extends AbstractTestCase {
    private StringBuilder dataBad;
    private StringBuilder dataGoodG2B;
    private StringBuilder dataGoodB2G;
    private void badSink() throws Throwable {
        StringBuilder data = dataBad;
        IO.writeLine("" + data.length());
    }
    public void handle() throws Throwable {
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
