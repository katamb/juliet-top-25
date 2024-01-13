package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J1435 extends AbstractTestCase {
    public void process() throws Throwable {
        process1();
    }
    private void process1() throws Throwable {
        {
            String myString = null;
            if (myString == null) {
                IO.writeLine("The string is null");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
