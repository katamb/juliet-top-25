package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J12943 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BSink(int data) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private void processG2B() throws Throwable {
        int data;
        data = 2;
        gG2BSink(data);
    }
    private void gB2GSink(int data) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            array[data] = 42;
        } else {
            IO.writeLine("Array index out of bounds");
        }
    }
    private void processB2G() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        gB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
