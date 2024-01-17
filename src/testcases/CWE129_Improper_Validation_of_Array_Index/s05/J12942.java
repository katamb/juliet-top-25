package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J12942 extends AbstractTestCase {
    private void badSink(int data) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    public void handle() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
