package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19691 extends AbstractTestCase {
    private void process1() throws Throwable {
        while (true) {
            {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                myString = "my, how I've changed";
                IO.writeLine(myString.length());
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
