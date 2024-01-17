package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11888 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public void handle() throws Throwable {
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
    private int goodB2GSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
