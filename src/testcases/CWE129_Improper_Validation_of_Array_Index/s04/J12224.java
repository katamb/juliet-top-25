package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12224 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_FIVE == 5) {
            data = -1;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_FIVE == 5) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
