package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11898 extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void handle() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = 100;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
