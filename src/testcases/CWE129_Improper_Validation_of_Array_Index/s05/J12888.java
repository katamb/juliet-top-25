package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J12888 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = (new SecureRandom()).nextInt();
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int array[] = null;
                if (data >= 0) {
                    array = new int[data];
                } else {
                    IO.writeLine("Array size is negative");
                }
                array[0] = 5;
                IO.writeLine(array[0]);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
