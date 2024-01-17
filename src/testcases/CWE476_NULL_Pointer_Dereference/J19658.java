package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19658 extends AbstractTestCase {
    private int[] dataBad;
    private int[] dataGoodG2B;
    private int[] dataGoodB2G;
    private void badSink() throws Throwable {
        int[] data = dataBad;
        IO.writeLine("" + data.length);
    }
    public void handle() throws Throwable {
        int[] data;
        data = null;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
