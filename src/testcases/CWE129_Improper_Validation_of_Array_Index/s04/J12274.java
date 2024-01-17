package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12274 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        while (true) {
            data = -1;
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
