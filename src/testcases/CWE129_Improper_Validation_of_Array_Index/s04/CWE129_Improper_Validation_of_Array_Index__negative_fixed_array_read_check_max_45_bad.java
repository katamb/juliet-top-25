package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_check_max_45_bad extends AbstractTestCase {
    private int dataBad;
    private int dataGoodG2B;
    private int dataGoodB2G;
    private void badSink() throws Throwable {
        int data = dataBad;
        int array[] = {0, 1, 2, 3, 4};
        if (data < array.length) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    public void bad() throws Throwable {
        int data;
        data = -1;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
