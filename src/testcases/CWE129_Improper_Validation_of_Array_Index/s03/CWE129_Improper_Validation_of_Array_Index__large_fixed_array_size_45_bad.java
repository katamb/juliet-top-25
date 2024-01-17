package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_size_45_bad extends AbstractTestCase {
    private int dataBad;
    private int dataGoodG2B;
    private int dataGoodB2G;
    private void badSink() throws Throwable {
        int data = dataBad;
        int array[] = null;
        if (data >= 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    public void bad() throws Throwable {
        int data;
        data = 100;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
