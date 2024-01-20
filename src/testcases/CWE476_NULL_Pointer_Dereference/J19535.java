package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19535 extends AbstractTestCase {
    private void process1() throws Throwable {
        while (true) {
            {
                String myString = null;
                if ((myString != null) && (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
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
