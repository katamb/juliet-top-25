package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11794 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        int data;
        data = 100;
        bPrivate = true;
        bS(data);
    }
    private void bS(int data) throws Throwable {
        if (bPrivate) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
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
