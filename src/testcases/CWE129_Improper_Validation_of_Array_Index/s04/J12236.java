package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12236 extends AbstractTestCase {
    public void handle() throws Throwable {
        int dataCopy;
        {
            int data;
            data = -1;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
