package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19736 extends AbstractTestCase {
    private StringBuilder dataB;
    private StringBuilder dataGdG2B;
    private StringBuilder dataGdB2G;
    private void badSink() throws Throwable {
        StringBuilder data = dataB;
        IO.writeLine("" + data.length());
    }
    public void handle() throws Throwable {
        StringBuilder data;
        data = null;
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
