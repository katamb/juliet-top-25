package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J12242 extends AbstractTestCase {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    private void bS() throws Throwable {
        int data = dataB;
        int array[] = {0, 1, 2, 3, 4};
        IO.writeLine(array[data]);
    }
    public void handle() throws Throwable {
        int data;
        data = -1;
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
