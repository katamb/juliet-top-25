package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19689 extends AbstractTestCase {
    private void process1() throws Throwable {
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default: {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                myString = "my, how I've changed";
                IO.writeLine(myString.length());
            }
            break;
        }
    }
    private void g2() throws Throwable {
        switch (7) {
            case 7: {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                myString = "my, how I've changed";
                IO.writeLine(myString.length());
            }
            break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
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
