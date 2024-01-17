package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE129_Improper_Validation_of_Array_Index__random_array_read_check_max_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
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
                int array[] = {0, 1, 2, 3, 4};
                if (data < array.length) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
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
