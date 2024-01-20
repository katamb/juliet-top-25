package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11842 extends AbstractTestCase {
    private void bS(int data) throws Throwable {
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    public void handle() throws Throwable {
        int data;
        data = 100;
        bS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
