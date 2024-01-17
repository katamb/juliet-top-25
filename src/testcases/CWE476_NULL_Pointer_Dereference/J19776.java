package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19776 extends AbstractTestCase {
    private void badSink(String data) throws Throwable {
        IO.writeLine("" + data.length());
    }
    public void handle() throws Throwable {
        String data;
        data = null;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
