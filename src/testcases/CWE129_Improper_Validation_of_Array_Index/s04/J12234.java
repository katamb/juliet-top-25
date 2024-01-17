package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12234 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        int data;
        data = -1;
        bPrivate = true;
        badSink(data);
    }
    private void badSink(int data) throws Throwable {
        if (bPrivate) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
