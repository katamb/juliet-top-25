package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J12945 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        int data = processG2BSce();
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private int processB2GSce() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    private void processB2G() throws Throwable {
        int data = processB2GSce();
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            array[data] = 42;
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
