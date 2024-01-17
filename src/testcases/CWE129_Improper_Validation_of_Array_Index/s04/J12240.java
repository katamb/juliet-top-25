package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12240 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = -1;
        return data;
    }
    public void handle() throws Throwable {
        int data = badSource();
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    private int processG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int processB2GSource() throws Throwable {
        int data;
        data = -1;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
