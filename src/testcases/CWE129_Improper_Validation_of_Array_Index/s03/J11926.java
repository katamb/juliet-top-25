package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11926 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void handle() throws Throwable {
        int data;
        data = 100;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(int data) throws Throwable {
        if (badPrivate) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
