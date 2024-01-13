package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J1441 extends AbstractTestCase {
    public void process() throws Throwable {
        process1();
    }
    private void process1() throws Throwable {
        {
            String myString = null;
            myString = "Hello";
            IO.writeLine(myString.length());
            myString = "my, how I've changed";
            IO.writeLine(myString.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
