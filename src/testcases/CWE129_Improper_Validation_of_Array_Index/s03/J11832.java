package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11832 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = 100;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                IO.writeLine(array[data]);
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
