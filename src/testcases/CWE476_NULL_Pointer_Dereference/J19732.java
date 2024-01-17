package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19732 extends AbstractTestCase {
    private void badSink(StringBuilder data) throws Throwable {
        IO.writeLine("" + data.length());
    }
    public void handle() throws Throwable {
        StringBuilder data;
        data = null;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
