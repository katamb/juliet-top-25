package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19582 extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void handle() throws Throwable {
        Integer data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = null;
        } else {
            data = null;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
