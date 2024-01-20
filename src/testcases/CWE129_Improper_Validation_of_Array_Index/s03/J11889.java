package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11889 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        int data = processG2BSce();
        int array[] = null;
        if (data >= 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    private int processB2GSce() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    private void processB2G() throws Throwable {
        int data = processB2GSce();
        int array[] = null;
        if (data > 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
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
