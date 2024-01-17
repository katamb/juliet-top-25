package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_41_bad extends AbstractTestCase {
    private void badSink(int[] data) throws Throwable {
        IO.writeLine("" + data.length);
    }
    public void bad() throws Throwable {
        int[] data;
        data = null;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
