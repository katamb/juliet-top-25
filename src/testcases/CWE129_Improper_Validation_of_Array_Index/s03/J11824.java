package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11824 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.staticReturnsTrue()) {
            data = 100;
        } else {
            data = 0;
        }
        if (IO.staticReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
