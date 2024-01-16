package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE129_Improper_Validation_of_Array_Index__large_fixed_array_size_42 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public void bad() throws Throwable {
        int data = badSource();
        int array[] = null;
        if (data >= 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        int data = goodG2BSource();
        int array[] = null;
        if (data >= 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    private void goodB2G() throws Throwable {
        int data = goodB2GSource();
        int array[] = null;
        if (data > 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}