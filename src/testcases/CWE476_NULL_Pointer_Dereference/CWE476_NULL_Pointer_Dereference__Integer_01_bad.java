package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_01_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        Integer data;
        data = null;
        IO.writeLine("" + data.toString());
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
