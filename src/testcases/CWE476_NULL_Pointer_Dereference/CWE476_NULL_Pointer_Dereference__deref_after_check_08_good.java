package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__deref_after_check_08_good extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    private void good1() throws Throwable {
        if (privateReturnsFalse()) {
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
        if (privateReturnsTrue()) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
        }
    }
    public void good() throws Throwable {
        good1();
        good2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
