package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11801 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        int data = goodG2BSource();
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    private void processB2G() throws Throwable {
        int data = goodB2GSource();
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            IO.writeLine(array[data]);
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
