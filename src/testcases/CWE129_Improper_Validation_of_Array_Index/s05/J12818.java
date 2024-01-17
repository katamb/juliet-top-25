package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J12818 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (true) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (true) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
