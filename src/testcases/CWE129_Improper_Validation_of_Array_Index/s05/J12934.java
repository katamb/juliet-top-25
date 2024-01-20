package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J12934 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        while (true) {
            data = (new SecureRandom()).nextInt();
            break;
        }
        while (true) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
