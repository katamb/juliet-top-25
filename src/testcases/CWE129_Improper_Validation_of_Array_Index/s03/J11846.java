package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11846 extends AbstractTestCase {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    private void badSink() throws Throwable {
        int data = dataB;
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    public void handle() throws Throwable {
        int data;
        data = 100;
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
