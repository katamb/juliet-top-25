package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_read_no_check_41_bad extends AbstractTestCase {
    private void badSink(int data) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    public void bad() throws Throwable {
        int data;
        data = -1;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
