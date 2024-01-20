package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19571 extends AbstractTestCase {
    private void process1() throws Throwable {
        for (int k = 0; k < 1; k++) {
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
