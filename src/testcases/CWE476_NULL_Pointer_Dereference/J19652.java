package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19652 extends AbstractTestCase {
    public void handle() throws Throwable {
        int[] dataCopy;
        {
            int[] data;
            data = null;
            dataCopy = data;
        }
        {
            int[] data = dataCopy;
            IO.writeLine("" + data.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
