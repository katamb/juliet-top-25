package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12284 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = -1;
        return data;
    }
    public void handle() throws Throwable {
        int data = bSce();
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int processB2GSce() throws Throwable {
        int data;
        data = -1;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
