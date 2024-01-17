package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11804 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        data = 100;
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
