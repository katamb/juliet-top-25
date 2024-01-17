package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11844 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public void handle() throws Throwable {
        int data = bSce();
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int processB2GSce() throws Throwable {
        int data;
        data = 100;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
