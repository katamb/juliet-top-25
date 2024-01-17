package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19567 extends AbstractTestCase {
    private void process1() throws Throwable {
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default: {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
            break;
        }
    }
    private void good2() throws Throwable {
        switch (7) {
            case 7: {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
            break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
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
