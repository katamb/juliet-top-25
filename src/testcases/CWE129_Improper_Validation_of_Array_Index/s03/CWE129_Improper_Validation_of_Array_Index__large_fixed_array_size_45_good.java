package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_size_45_good extends AbstractTestCase {
    private int dataBad;
    private int dataGoodG2B;
    private int dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        int data = dataGoodG2B;
        int array[] = null;
        if (data >= 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        int data = dataGoodB2G;
        int array[] = null;
        if (data > 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    private void goodB2G() throws Throwable {
        int data;
        data = 100;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
