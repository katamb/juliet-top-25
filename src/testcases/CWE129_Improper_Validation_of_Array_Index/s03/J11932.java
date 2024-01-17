package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11932 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public void handle() throws Throwable {
        int data = badSource();
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private int processG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int processB2GSource() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
