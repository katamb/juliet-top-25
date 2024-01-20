package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11834 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        while (true) {
            data = 100;
            break;
        }
        while (true) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
