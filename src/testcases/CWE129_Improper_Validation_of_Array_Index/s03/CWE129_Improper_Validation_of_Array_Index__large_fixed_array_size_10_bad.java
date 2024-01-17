package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_size_10_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticTrue) {
            data = 100;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            int array[] = null;
            if (data >= 0) {
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
