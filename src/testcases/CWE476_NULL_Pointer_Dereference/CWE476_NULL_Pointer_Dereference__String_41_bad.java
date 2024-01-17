package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_41_bad extends AbstractTestCase {
    private void badSink(String data) throws Throwable {
        IO.writeLine("" + data.length());
    }
    public void bad() throws Throwable {
        String data;
        data = null;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
