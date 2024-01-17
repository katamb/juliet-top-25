package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11870 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 100;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int array[] = null;
            if (data >= 0) {
                array = new int[data];
            } else {
                IO.writeLine("Array size is negative");
            }
            array[0] = 5;
            IO.writeLine(array[0]);
        } else {
            int array[] = null;
            if (data > 0) {
                array = new int[data];
            } else {
                IO.writeLine("Array size is negative");
            }
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
