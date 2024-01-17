package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19569 extends AbstractTestCase {
    private void process1() throws Throwable {
        while (true) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
            break;
        }
    }
    public void process() throws Throwable {
        process1();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
