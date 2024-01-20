package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19561 extends AbstractTestCase {
    private void process1() throws Throwable {
        if (IO.staticReturnsTrueOrFalse()) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
        } else {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
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
