package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19608 extends AbstractTestCase {
    public void handle() throws Throwable {
        Integer dataCopy;
        {
            Integer data;
            data = null;
            dataCopy = data;
        }
        {
            Integer data = dataCopy;
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
