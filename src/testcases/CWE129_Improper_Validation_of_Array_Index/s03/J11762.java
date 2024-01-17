package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11762 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (true) {
            data = 100;
        } else {
            data = 0;
        }
        if (true) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
