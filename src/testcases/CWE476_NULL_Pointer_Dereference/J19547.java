package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19547 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void process1() throws Throwable {
        if (privateFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
        }
    }
    private void g2() throws Throwable {
        if (privateTrue) {
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
        g2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
