package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19658 extends AbstractTestCase {
    private int[] dataB;
    private int[] dataGdG2B;
    private int[] dataGdB2G;
    private void bS() throws Throwable {
        int[] data = dataB;
        IO.writeLine("" + data.length);
    }
    public void handle() throws Throwable {
        int[] data;
        data = null;
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
