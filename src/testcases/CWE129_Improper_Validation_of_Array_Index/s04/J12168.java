package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12168 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        int data;
        if (privateFive == 5) {
            data = -1;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            int array[] = {0, 1, 2, 3, 4};
            if (data < array.length) {
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
