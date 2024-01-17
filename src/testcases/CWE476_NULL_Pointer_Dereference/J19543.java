package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19543 extends AbstractTestCase {
    private void process1() throws Throwable {
        if (5 != 5) {
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
    private void good2() throws Throwable {
        if (5 == 5) {
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
        good2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
