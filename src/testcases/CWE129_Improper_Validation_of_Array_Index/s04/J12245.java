package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12245 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        int data;
        data = 2;
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private void processB2G() throws Throwable {
        int data;
        data = -1;
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            array[data] = 42;
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
